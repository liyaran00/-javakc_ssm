<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>物资-供应商关系列表页面</title>
        <%@ include file="../../../common/jsp/header.jsp" %>
    </head>
    <body>
        <div class="wrapper wrapper-content animated fadeInRight">
            <div class="ibox float-e-margins">
                <form id="searchForm" action="">
                    <div class="col-sm-12">
                        <!-- ------------按钮组 start------------ -->
                        <div class="alert alert-success" role="alert">物资-供应商关系详细信息</div>
                        <div class="col-sm-8">
                            <div class="btn-group hidden-xs" role="group">
                                <button type="button" class="btn btn-primary" data-toggle="modal" id="create" name="test/create.jsp">
                                    <i class="glyphicon glyphicon-plus" aria-hidden="true"></i>添加
                                </button>
                                <button type="button" class="btn btn-success" data-toggle="modal" id="update" name="test/view.do">
                                    <i class="glyphicon glyphicon-pencil" aria-hidden="true"></i>修改
                                </button>
                                <button type="button" class="btn btn-danger" data-toggle="modal" id="delete" name="test/delete.do">
                                    <i class="glyphicon glyphicon-trash" aria-hidden="true"></i>删除
                                </button>
                            </div>
                        </div>
                        <div class="col-sm-4">
                            <input class="form-control" id="search" name="testName" value="${testEntity.testName }" type="text"
                                   placeholder="查询内容 回车搜索"/>
                        </div>
                        <!-- ------------按钮组 end------------ -->
                        <input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
                        <input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
                        <table class="table table-striped table-bordered table-hover table-condensed">
                            <thead>
                            <tr>
                                <th><input type="checkbox" id="checkall"/></th>
                                <th>组织</th>
                                <th>供应商</th>
                                <th>物资</th>
                                <th>税率</th>
                                <th>收货组织</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:set var="vs"></c:set>
                            <c:forEach var="e" items="${page.list }" varStatus="v">
                                <tr>
                                    <td><input type="checkbox" name="ids" value="${e }"/></td>
                                    <td>${e.orgId }</td>
                                    <td>${e.supplierId }</td>
                                    <td>${e.materialId }</td>
                                    <td>${e.msTaxRate }</td>
                                    <td>${e.toOrg }</td>
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