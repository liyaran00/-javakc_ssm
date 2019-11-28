<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>供应商展示列表页面</title>
		<%@ include file="../../../common/jsp/header.jsp"%>
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">
			<div class="ibox float-e-margins">
				<form id="searchForm" action="">
				<div class="col-sm-12">
					<!-- ------------按钮组 start------------ -->
	                <div class="alert alert-success" role="alert">供应商详细信息</div>
	                <div class="col-sm-8">
	                	<div class="btn-group hidden-xs" role="group">
							<button type="button" class="btn btn-info" data-toggle="modal" id="query" name="mdata/supplier/list.jsp">
								<i class="glyphicon glyphicon-zoom-in" aria-hidden="true"></i>查询
							</button>
                			<button type="button" class="btn btn-primary" data-toggle="modal" id="create" name="mdata/supplier/create.jsp">
	                            <i class="glyphicon glyphicon-plus" aria-hidden="true"></i>添加
	                        </button>
	                        <button type="button" class="btn btn-success" data-toggle="modal" id="update" name="supplier/view.do">
	                            <i class="glyphicon glyphicon-pencil" aria-hidden="true"></i>修改
	                        </button>
	                        <button type="button" class="btn btn-danger" data-toggle="modal" id="delete" name="supplier/delete.do">
	                            <i class="glyphicon glyphicon-trash" aria-hidden="true"></i>删除
	                        </button>
		                 </div>
	                </div>
					<div class="col-sm-2">
						<input class="form-control" id="search1" name="supplierName" value="${supplierEntity.supplierName }" type="text" placeholder="供应商名称"/>
					</div>
	                <div class="col-sm-2">
						<select class="form-control" id="search2" name="supplierState" value="${supplierEntity.supplierState }">
							<option value="">全部</option>
							<option value="1">已启用</option>
							<option value="0">已停用</option>
						</select>
					</div>
	                 <!-- ------------按钮组 end------------ -->
						<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
						<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		                 <table class="table table-striped table-bordered table-hover table-condensed">
					        <thead>
					            <tr>
					                <th><input type="checkbox" id="checkall"/></th>
					                <th>供应商编码</th>
					                <th>供应商名称</th>
									<th>供应商类型</th>
									<th>联系人</th>
									<th>联系电话</th>
									<th>必须合同</th>
									<th>是否启用门户</th>
					            </tr>
					        </thead>
					        <tbody>
					        	<c:set var="vs"></c:set>
					        	<c:forEach var="e" items="${page.list }" varStatus="v">
						            <tr>
						                <td><input type="checkbox" name="ids" value="${e.supplierId}"/></td>
						                <td>${e.supplierId}</td>
										<td>${e.supplierName}</td>
										<td>${e.supplierState}</td>
										<td>${e.supplierLinkman}</td>
										<td>${e.supplierLinkmanPhone}</td>
										<td>${e.supplierIsContract.equals('1')?'是':'否'}</td>
										<td>${e.supplierIsGateway.equals('1')?'已启用':'已停用'}</td>
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