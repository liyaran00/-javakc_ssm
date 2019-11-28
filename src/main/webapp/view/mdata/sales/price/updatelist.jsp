<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>客户信息展示列表页面</title>
	<%@ include file="../../../../common/jsp/header.jsp"%>
</head>
<body>
<div class="wrapper wrapper-content animated fadeInRight">
	<div class="ibox float-e-margins">
		<form id="searchForm" action="">
			<div class="col-sm-12">
				<!-- ------------按钮组 start------------ -->
				<div class="alert alert-success" role="alert">客户信息详细信息</div>
				<div class="col-sm-12">
					<form class="form-horizontal">
						<div class="form-group">
							<label for="client_id" class="col-sm-2 control-label">客户</label>
							<div class="col-sm-4">
								<input type="client" class="form-control" id="client_id" placeholder="客户">
							</div>
						</div>
						<div class="form-group">
							<label for="material_id" class="col-sm-2 control-label">物资</label>
							<div class="col-sm-4">
								<input type="material" class="form-control" id="material_id" placeholder="物资">
							</div>
						</div>
						<div class="form-group">
							<label for="org_id" class="col-sm-2 control-label">销售组织</label>
							<div class="col-sm-4">
								<input type="org" class="form-control" id="org_id" placeholder="销售组织">
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="submit" class="btn btn-primary">查询</button>
							</div>
						</div>
					</form>
				</div>
				<!-- ------------按钮组 end------------ -->
				<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
				<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
				<table class="table table-striped table-bordered table-hover table-condensed">
					<thead>
					<tr>
						<th><input type="checkbox" id="checkall"/></th>
						<th>销售价</th>
						<th>生效日期</th>
						<th>失效日期</th>
						<th>增删行</th>
					</tr>
					</thead>
					<tbody>
					<c:set var="vs"></c:set>
					<c:forEach var="e" items="${page.list}" varStatus="v">
						<tr>
							<td><input type="checkbox" name="ids" value="${e.salesPriceDateId }"/></td>
							<td>${e.salesPrice}</td>
							<td><fmt:formatDate value="${e.salesPriceSdate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
							<td><fmt:formatDate value="${e.salesPriceEdate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
							<td></td>

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


