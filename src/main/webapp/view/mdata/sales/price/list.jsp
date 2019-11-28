<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>客户信息展示列表页面</title>
    <%@ include file="../../../../common/jsp/header.jsp" %>
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
                            <label for="client_id" class="col-sm-1 control-label">客户</label>
                            <div class="col-sm-3">
                                <input type="client" class="form-control" id="client_id" placeholder="客户">
                            </div>

                            <div class="form-group">
                                <label for="material_id" class="col-sm-1 control-label">物资</label>
                                <div class="col-sm-3">
                                    <input type="material" class="form-control" id="material_id" placeholder="物资">
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="org_id" class="col-sm-1 control-label">销售组织</label>
                                <div class="col-sm-3">
                                    <input type="org" class="form-control" id="org_id" placeholder="销售组织">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="org_id" class="col-sm-1 control-label">状态</label>
                                <select class="form-control" class="col-sm-3">
                                    <option>全部</option>
                                    <option>新增</option>
                                    <option>已审核</option>
                                    <option>待审核</option>
                                </select>
                            </div>
                    </form>
                </div>
                <div class="col-sm-8">
                    <div class="btn-group hidden-xs" role="group">
                        <button type="button" class="btn btn-primary" data-toggle="modal" id="create"
                                name="mdata/sales/price/create.jsp">
                            <i class="glyphicon glyphicon-plus" aria-hidden="true"></i>新增
                        </button>
                    </div>
                </div>
                <!-- ------------按钮组 end------------ -->
                <input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
                <input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
                <table class="table table-striped table-bordered table-hover table-condensed">
                    <thead>
                    <tr>
                        <th><input type="checkbox" id="checkall"/></th>
                        <th>销售组织</th>
                        <th>调价组</th>
                        <th>客户</th>
                        <th>销售价编号</th>
                        <th>物资</th>
                        <th>物资分类</th>
                        <th>规格</th>
                        <th>计价单位</th>
                        <th>价格员</th>
                        <th>状态</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:set var="vs"></c:set>
                    <c:forEach var="e" items="${page.list}" varStatus="v">
                        <tr>
                            <td><input type="checkbox" name="ids" value="${e.salesPriceId }"/></td>
                            <td>${e.orgId }</td>
                            <td></td>
                            <td>${e.clientName }</td>
                            <td>${e.salesPriceId }</td>
                            <td></td>
                                <%--${e.materialName} 物资--%>
                            <td></td>
                                <%-- ${e.categoryId}物资分类--%>
                            <td></td>
                                <%--${e.materialStandard} 规格--%>
                            <td>${e.chargeUnit }</td>
                            <td>${e.creator }</td>
                            <td>${e.salesPriceState }</td>
                            <td>

                                <button type="button" class="btn btn-success" data-toggle="modal" id="update"
                                        name="/mdata/sales/date/view.do">
                                    <i class="glyphicon glyphicon-pencil" aria-hidden="true"></i>修改
                                </button>

                                <button type="button" class="btn btn-default" aria-label="Left Align">
                                    <span class="glyphicon glyphicon-wrench" aria-hidden="true"></span>
                                </button>

                                <button type="button" class="btn btn-default" aria-label="Left Align">
                                    <span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
                                </button>

                            </td>

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


<%----    SELECT--%>
<%----  SALES_PRICE_ID AS salesPriceId,--%>
<%----  ORG_ID AS orgId,--%>
<%----  CLIENT_ID AS clientId,--%>
<%----  CHARGE_UNIT AS chargeUnit,--%>
<%----  MATERIAL_ID AS materialId,--%>
<%----  SP_HISTORY_ID AS spHistroyId,--%>
<%----  SALES_PRICE_STATE AS salesPriceState,--%>
<%----  CREATOR AS creator,--%>
<%----  CREATE_DATE AS createDate--%>
<%----  FROM xbs_sales_price WHERE 1=1--%>




