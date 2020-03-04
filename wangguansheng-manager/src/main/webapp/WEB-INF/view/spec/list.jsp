<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加规格</title>
</head>
<body>
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#staticBackdrop">
   添加
</button>

<!-- Modal -->
<div class="modal fade" id="staticBackdrop" data-backdrop="static" tabindex="-1" role="dialog" aria-labelledby="staticBackdropLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        	<h5 class="modal-title" id="staticBackdropLabel">添加规格</h5>
	         <button type="button"  type="button" class="btn btn-light" onclick="addProp()"> 添加属性
	         </button>
        
         
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
        	
      </div>
      <div class="modal-body">
        	<form id="addspec">
        		 <div class="form-group">
    				<label for="specName">规格名称</label>
    				<input type="text" class="form-control" name="specName" id="specName" aria-describedby="specNamelHelp">
    				<small id="specNamelHelp" class="form-text text-muted">请输入规格名称</small>
  				</div>
  				<div class="form-group">
    				<label for="inputAddress">属性值</label>
    				<input type="text" name="options[0].optionName" class="form-control" id="inputAddress" placeholder="1234 Main St">
    				<button type="button" class="btn btn-outline-secondary" onclick="$(this).parent().remove()">删除</buttonn>
  				</div>
  				
    			
        	</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" onclick="commitSpec()">提交</button>
      </div>
    </div>
  </div>
</div>	
	
	
	<table class="table">
	<tr> 
		<th>id</th>
		<th>名称</th>
		<th>详情</th>
	</tr>
	<c:forEach items="${info.list}" var="spec">
		<tr>
			<td>${spec.id}</td>
			<td>${spec.specName}</td>
			<td>
				<c:forEach items="${spec.options}" var="op" >
					&nbsp;&nbsp; ${op.optionName}
				</c:forEach>
			</td>
		</tr>
	</c:forEach>
	
	<!-- pageInfo -->
	<tr>
		<th>
			<%-- <a href="select?pageNum=1">首页</a>
		    <a href="select?pageNum=${info.prePage==1?0:info.prePage }">上页</a>
		    <a href="select?pageNum=${info.prePage==1?info.pages:info.nextPage }">下页</a>
		    <a href="select?pageNum=${info.pages }">尾页</a> --%>
		      ，  每页数量${info.size } ，当前页${info.pageNum }/总页数${info.pages },
		</th>
	</tr>
	
	<%-- <jsp:include page="/common/pages.jsp"></jsp:include> --%>
	
</table>
<script type="text/javascript">

	
		
	var addindex=1;
	function addProp(){
		$("#addspec").append('<div class="form-group">'+
    				'<label for="inputAddress">属性值</label>'+
    				'<input type="text" name="options['+addindex+'].optionName" class="form-control" id="inputAddress" placeholder=" 请输入规格 ">'+
    				'<button type="button" class="btn btn-outline-secondary" onclick="$(this).parent().remove()">删除</button>'+
    				'</div>')
    	addindex++;
	} 
	
	/**
	  提交数据	
	*/
	function commitSpec(){
		//addspec
		var formData = new FormData($("#addspec")[0]);
		$.ajax({url:"/spec/add",
			  dataType:"json",
			  data:formData,
			  // 让jQuery 不要再提交数据之前进行处理
			  processData : false,
			  // 提交的数据不能加消息头
			  contentType : false,
			  // 提交的方式 
			  type:"post",
			  // 成功后的回调函数
			  success:function(data){
				  if(data>0){
					  alert("成功添加")   
				  }else{
					  alert("失败添加")   
				  }
				  
			  	}
			  })
		}
		
	</script>
	
</body>
</html>