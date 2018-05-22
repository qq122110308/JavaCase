<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>模拟下拉框(IE)</title>
<link rel="stylesheet" href="css/autocomplete.css" />
<script type="text/javascript" src="js/jquery.min.js" ></script>
<script type="text/javascript" src="js/autocomplete.js" ></script>
</head>
<body>
	<div id="" class="cj-select w-198 cj-choose-up" >
        <div id="search-form"></div>
		<div id="message" style="display:none"></div>
    </div>
</body>

<script type="text/javascript">

var proposals = new Array();
var zplxvalues = new Array();
var arrPy = new Array();

proposals = ["北京市","天津市","上海市","重庆市","河北省","山西省","辽宁省","吉林省","黑龙江省"
             ,"江苏省","浙江省","安徽省","福建省","江西省","山东省","河南省","湖北省","湖南省","广东省","海南省","四川省"
             ,"贵州省","云南省","陕西省","甘肃省","青海省","台湾省","内蒙古自治区","广西壮族自治区","西藏自治区"
             ,"宁夏回族自治区","新疆维吾尔自治区","香港特别行政区","澳门特别行政区"];
zplxvalues = ["01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20"
              ,"21","22","23","24","25","26","27","28","29","30","31","32","33","34"];
arrPy = ["bjs","tjs","shs","cqs","hbs","sxs","lns","jls","hljs"
         ,"jss","zjs","ahs","fjs","jxs","sds","hns","hbs","hns","gds","hns","scs"
         ,"gzs","yns","sxs","gss","qhs","tws","nmgzzq","gxgzzzq","xzzzq"
         ,"qxhzzzq","xjwwezzzq","xgtbxzq","amtbxzq"];
//这里不从后台取，直接在前台赋值，只是为了看到有下拉框的效果
$(document).ready(function(){
	
	$('#search-form').autocomplete({
		hints: arrPy,
		realnames: proposals,
		realvalues:zplxvalues,
		width: 250,
		height: 15,
		onSubmit: function(text){
			//在这里判断算了   给图片类型赋值
			for(var i = 0; i < proposals.length; i++){
				//console.log(proposals[i]);
				if(text == proposals[i]){
					/* $("#drvdzdalx").val(zplxvalues[i]);
					$("#drvdzdalxmc").val(text);
					changedalx(text); */
					break;
				}
			}
		}
	});
	
	
	/* $.ajax({
		type: "post",
		url: "drvdzdadj_showZpType.action",
		data: {t:Math.random()},
		dataType: "json",
		success: function(data){
			for(var i = 0; i < data.length; i++){
				if(data[i].MC == "未知文档"){
					wzwd = data[i].BZDM;
				}
				proposals[i] = data[i].MC;
				zplxvalues[i] = data[i].BZDM;
				arrPy[i] = data[i].KZ;
			}
			
			$('#search-form').autocomplete({
				hints: arrPy,
				realnames: proposals,
				realvalues:zplxvalues,
				width: 250,
				height: 15,
				onSubmit: function(text){
					//在这里判断算了   给图片类型赋值
					for(var i = 0; i < proposals.length; i++){
						//console.log(proposals[i]);
						if(text == proposals[i]){
							$("#drvdzdalx").val(zplxvalues[i]);
							$("#drvdzdalxmc").val(text);
							changedalx(text);
							break;
						}
					}
				}
			});
		},
		error: function(){
			alert("调用ajax失败！");
		}
	}); */
});	
</script>

</html>

