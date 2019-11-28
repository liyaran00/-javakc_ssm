<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>物资列表页面</title>
		<%@ include file="../../../common/jsp/header.jsp"%>
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">
			<div class="ibox float-e-margins">
				<form id="searchForm" action="">
				<div class="col-sm-12">
					<!-- ------------按钮组 start------------ -->
<%--	                <div class="alert alert-success" role="alert">物资类</div>--%>




                    <form class="form-horizontal">
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">修改日期</label>
                            <div class="col-sm-6">
                                <input type="email" class="form-control" id="inputEmail3" placeholder="Email">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-1 col-sm-1">
                                <button type="submit" class="btn btn-default">当日</button>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-1 col-sm-1">
                                <button type="submit" class="btn btn-default">近一月</button>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">物资分类</label>
                            <div class="col-sm-4">
                                <input type="password" class="form-control" id="inputPassword3" placeholder="Password">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">物资状态</label>
                            <div class="col-sm-4">
                                <input type="password" class="form-control" id="inputPassword4" placeholder="Text">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">物资名称</label>
                            <div class="col-sm-4">
                                <input type="password" class="form-control" id="inputPassword5" placeholder="Password">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">物资简称</label>
                            <div class="col-sm-4">
                                <input type="password" class="form-control" id="inputPassword6" placeholder="Password">
                            </div>
                        </div>

                    </form>




					<div class="col-sm-8">
						<div class="btn-group hidden-xs" role="group">
							<button type="button" class="btn btn-primary" data-toggle="modal" id="create" name="mdata/material/create.jsp">
								<i class="glyphicon glyphicon-plus" aria-hidden="true"></i>添加
							</button>
							<button type="button" class="btn btn-success" data-toggle="modal" id="update" name="material/view.do">
								<i class="glyphicon glyphicon-pencil" aria-hidden="true"></i>修改
							</button>
							<button type="button" class="btn btn-danger" data-toggle="modal" id="delete" name="material/delete.do">
								<i class="glyphicon glyphicon-trash" aria-hidden="true"></i>删除
							</button>
						</div>
					</div>
<%--	                <div class="col-sm-4">--%>
<%--	                	<input class="form-control" id="search" name="testName" value="${testEntity.testName }" type="text" placeholder="查询内容 回车搜索"/>--%>
<%--	                </div>--%>
	                 <!-- ------------按钮组 end------------ -->
						<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
						<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		                 <table class="table table-striped table-bordered table-hover table-condensed">
					        <thead>
					            <tr>

					                <th><input type="checkbox" id="checkall"/></th>
					                <th>物资编码</th>
					                <th>物资名称</th>
					                <th>物资简称</th>
									<th>规格</th>
									<th>物资分类</th>
									<th>基本单位</th>
									<th>状态</th>
									<th>修改时间</th>
									<th>创建人</th>
									<th>操作</th>

					            </tr>
					        </thead>
					        <tbody>
					        	<c:set var="vs"></c:set>
					        	<c:forEach var="e" items="${page.list }" varStatus="v">
						            <tr>
						                <td><input type="checkbox" name="ids" value="${e.materialId }"/></td>
						                <td>${e.materialId }</td>
										<td>${e.materialName }</td>
										<td>${e.materialNano }</td>
										<td>${e.materialStandard }</td>
										<td>${e.categoryName}</td>
										<td>${e.materialBaseUnit }</td>
										<td>${e.materialState }</td>
						                <td><fmt:formatDate value="${e.materialUpdateDate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
										<td>${e.creator }</td>
										<td>"复制，编辑，停用，单位转换（需开发功能）"</td>

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