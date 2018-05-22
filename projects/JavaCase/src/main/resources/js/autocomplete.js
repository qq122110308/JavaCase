/**
A jQuery plugin for search hints

Author: Lorenzo Cioni - https://github.com/lorecioni
*/

(function($) {
	//是否存在下拉框
	var sfczxlk = 0;
	$.fn.autocomplete = function(params) {
		
		//Selections
		var currentSelection = -1;
		var currentProposals = [];
		
		//Default parameters
		params = $.extend({
			hints: [],
			realnames :[],
			realvalues :[],
			placeholder: 'Search',
			width: 200,
			height: 16,
			showButton: false,
			buttonText: 'Search',
			onSubmit: function(text){},
			onBlur: function(){}
		}, params);

		//Build messagess
		this.each(function() {
			//Container
			var searchContainer = $('<div style="" ></div>')
				.addClass('autocomplete-container')
				.css('height', params.height * 2);	
				
			//Text input		
			var input = $('<input type="text" autocomplete="off"  name="query"> ')
				.attr('placeholder', params.placeholder)
				.addClass('autocomplete-input');
				/*.css({
					'width' : params.width,
					'height' : params.height
				});*/
			
			var image = $('<img  id="picClick" src="images/combox.png" onerror="'+"javascript:this.src=images/combox.png"+'";  onclick="sPicType('+params+')" style="float:left;margin-top:5px; margin-left:-18px;position:relative;z-index:100;  height:15px;width:15px;" >');
			
			
			if(params.showButton){
				input.css('border-radius', '3px 0 0 3px');
			}

			//Proposals
			var proposals = $('<div></div>')
				.addClass('proposal-box')
				.css('width', params.width + 18)
				.css('top', input.height() + 20);
			var proposalList = $('<ul></ul>')
				.addClass('proposal-list');

			proposals.append(proposalList);
			
			input.keydown(function(e) {
				switch(e.which) {
					case 38: // Up arrow
					e.preventDefault();
					sfczxlk = 0;
					$('ul.proposal-list li').removeClass('selected');
					if((currentSelection - 1) >= 0){
						currentSelection--;
						$( "ul.proposal-list li:eq(" + currentSelection + ")" )
							.addClass('selected');
					} else {
						currentSelection = -1;
					}
					break;
					case 40: // Down arrow
					e.preventDefault();
					sfczxlk = 0;
					if((currentSelection + 1) < currentProposals.length){
						$('ul.proposal-list li').removeClass('selected');
						currentSelection++;
						$( "ul.proposal-list li:eq(" + currentSelection + ")" )
							.addClass('selected');
					}
					break;
					case 13: // Enter
						if(currentSelection > -1){
							var text = $( "ul.proposal-list li:eq(" + currentSelection + ")" ).html();
							input.val(text);
						}
						sfczxlk = 0;
						currentSelection = -1;
						proposalList.empty();
						params.onSubmit(input.val());
						break;
					case 27: // Esc button
						currentSelection = -1;
						proposalList.empty();
						input.val('');
						break;
				}
			});
			
			image.click(function(){
					currentProposals = [];
					currentSelection = -1;
					proposalList.empty();
					if(sfczxlk == 0){
						sfczxlk = 1; 
						var word = "^" + input.val() + ".*";
						proposalList.empty();
						for(var test in params.hints){
							currentProposals.push(params.hints[test]);	
							var element = $('<li></li>')
								.html(params.realnames[test])
								.addClass('proposal')
								.click(function(){
									sfczxlk = 0; 
									input.val($(this).html());
									proposalList.empty();
									//console.log(params.realvalues[test]);
									params.onSubmit($(this).html());
								})
								.mouseenter(function() {
									$(this).addClass('selected');
								})
								.mouseleave(function() {
									$(this).removeClass('selected');
								});
							proposalList.append(element);
						}
					}
					else{
						sfczxlk = 0; 
						proposalList.empty();
					}
				
			});
			
				
			input.bind("keyup", function(e){
				if(e.which != 13 && e.which != 27 
						&& e.which != 38 && e.which != 40){	
					sfczxlk = 0; 
					currentProposals = [];
					currentSelection = -1;
					proposalList.empty();
					if(input.val() != ''){
						var word = "^" + input.val() + ".*";
						proposalList.empty();
						for(var test in params.hints){
							if(params.hints[test].match(word)){
								currentProposals.push(params.hints[test]);	
								var element = $('<li></li>')
									.html(params.realnames[test])
									.addClass('proposal')
									.click(function(){
										input.val($(this).html());
										proposalList.empty();
										//console.log(params.realvalues[test]);
										params.onSubmit($(this).html());
									})
									.mouseenter(function() {
										$(this).addClass('selected');
									})
									.mouseleave(function() {
										$(this).removeClass('selected');
									});
								proposalList.append(element);
							}
						}
					}
				}
				
			});
			
			input.blur(function(e){
				currentSelection = -1;
				//proposalList.empty();
				params.onBlur();
			});
			
			searchContainer.append(input);
			searchContainer.append(image);
			searchContainer.append(proposals);		
			
			if(params.showButton){
				//Search button
				var button = $('<div></div>')
					.addClass('autocomplete-button')
					.html(params.buttonText)
					.css({
						'height': params.height + 2,
						'line-height': params.height + 2 + 'px'
					})
					.click(function(){
						proposalList.empty();
						params.onSubmit(input.val());
					});
				searchContainer.append(button);	
			}
	
			$(this).append(searchContainer);	
			
			if(params.showButton){
				//Width fix
				searchContainer.css('width', params.width + button.width() + 50);
			}
		});

		return this;
	};

})(jQuery);




















