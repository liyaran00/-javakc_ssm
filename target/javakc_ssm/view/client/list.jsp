<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>客户信息展示列表页面</title>
		<%@ include file="../../common/jsp/header.jsp"%>
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">
			<div class="ibox float-e-margins">
				<form id="searchForm" action="">
				<div class="col-sm-12">
					<!-- ------------按钮组 start------------ -->
	                <div class="alert alert-success" role="alert">客户信息详细信息</div>
	                <div class="col-sm-4">
	                	<input class="form-control" id="search" name="clientName" value="${clientEntity.clientName }" type="text" placeholder="查询内容 回车搜索"/>
						<input class="form-control" id="search" name="clientName" value="${clientEntity.clientName }" type="text" placeholder="查询内容 回车搜索"/>
						<input class="form-control" id="search" name="clientName" value="${clientEntity.clientName }" type="text" placeholder="查询内容 回车搜索"/>
					</div>
	                 <!-- ------------按钮组 end------------ -->
						<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
						<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		                 <table class="table table-striped table-bordered table-hover table-condensed">
					        <thead>
					            <tr>
					                <th><input type="checkbox" id="checkall"/></th>
					                <th>编码</th>
									<th>名称</th>
					                <th>缩写</th>
					                <th>联系人</th>
					                <th>电话</th>
									<th>客户编码</th>
					            </tr>
					        </thead>
					        <tbody>
					        	<c:set var="vs"></c:set>
					        	<c:forEach var="e" items="${page.list}" varStatus="v">
						            <tr>
						                <td><input type="checkbox" name="ids" value="${e.clientId }"/></td>
						                <td>${e.clientName }</td>
						                <td>${e.clientAbbr }</td>
						                <td>${e.clientLinkman }</td>
						                <td>${e.linkmanPhone }</td>
						                <td>${e.clientCode }</td>
						            </tr>
					            </c:forEach>
					        </tbody>
					    </table>
				    <div class="page">${page}</div>
			     </div>
			     </form>
			</div>
		</div>
	</body>
</html>