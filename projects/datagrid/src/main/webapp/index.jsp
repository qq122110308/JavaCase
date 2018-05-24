<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Datagrid例子</title>
<link rel="stylesheet" type="text/css" href="easyUI/themes/default/datagrid.css" />
<script type="text/javascript" src="easyUI/jquery.min.js"></script>
<script type="text/javascript" src="easyUI/jquery.easyui.min.js" ></script>
<script type="text/javascript" src="easyUI/plugins/jquery.datagrid.js"></script>
</head>
<body>
	<!-- 从已有的表格元素创建数据网格（datagrid），在 html 中定义列、行及数据 -->
	<table class="easyui-datagrid" >
		<thead>
			<tr>
				<th data-options="field:'code'">Code</th>
				<th data-options="field:'name'">Name</th>
				<th data-options="field:'price'">Price</th>
			</tr>
		</thead>
		
		<tbody>
			<tr>
				<td>001</td><td>name1</td><td>2323</td>
			</tr>
			<tr>
				<td>002</td><td>name2</td><td>3232</td>
			</tr>		
		</tbody>
	</table>
	
	<table class="easyui-datagrid" style="width:400px;height:250px;"
	data-options="
		url:'datagrid1Servlet',
		fitColumns:true,
		singleSelect:true
	"
	 >
	 	<thead>
	 		<tr>
	 			<th data-options="field:'Code',width:100">Code</th>
	 			<th data-options="field:'Name',width:100">Name</th>
	 			<th data-options="field:'Price',width:100">Price</th>
	 		</tr>
	 	</thead>
	</table>
	
	
	<table id="dg"></table>
	
	
</body>
<script type="text/javascript">
	$(function(){
		$("#dg").datagrid({
			/* url:"datagrid_data1.json", */
			url:"datagrid1Servlet",//连接后台的地址
			method:"post",//请求远程站点的类型
			title: 'Context Menu on DataGrid',//标题
			iconCls: 'icon-save', //图标
			idField:"code", //标识字段  例如：订单号这样的唯一字段
			nowrap:true,//设置为 true，则把数据显示在一行里。
			width: 700,//table宽度
			height: 250,//table高度
			loadMsg :"加载中",//当从远程站点加载数据时，显示的提示消息。
			rownumbers:true,//显示带有行号的列
			checkOnSelect:true,
			queryParams:{
				t:Math.random()
			},
			
			striped:true,
			fitColumns: true,//设置为 true，则会自动扩大或缩小列的尺寸以适应网格的宽度并且防止水平滚动。
			singleSelect: true,//设置为 true，则只允许选中一行。
			pagination: true,//设置为true,则底部显示分页工具栏。
			pagePosition:"bottom",//定义分页工具栏的位置
			pageNumber:1,//初始化页码
			pageSize : 3,//初始化页面尺寸
			pageList :[3,6,9],//初始化页面尺寸的选择列表
			//sortName:"name",
			//editors:0,
			columns:[[
				/* {field:'productid',title:'Code',width:100},
				{field:'productname',title:'Name',width:100},
				{field:'unitcost',title:'Price',width:100,align:'right'} */
				{title:'序号',checkbox:true,field:'price',width:100},
				{field:'code',title:'Code',width:100},
				{field:'name',title:'Name',width:100},
				/* {field:'price',title:'Price',width:100} */
			]]
			
		});
		
	})
	
	
</script>

</html>