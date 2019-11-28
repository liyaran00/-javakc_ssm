<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>测试管理添加页面</title>
    <%@ include file="../../../../common/jsp/header.jsp"%>
    <link href="${path }/static/css/plugins/file-input/fileinput.min.css" rel="stylesheet">
</head>
<body>
<div class="wrapper wrapper-content animated fadeInRight">

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

    <div>

    <div class="ibox float-e-margins">
        <form action="${path }/sales/create.do" method="post" class="form-horizontal" role="form">
            <fieldset>
                <legend>测试管理基本信息</legend>
                <div class="form-group">

                    <label class="col-sm-1 control-label" for="ds_host">销售价</label>
                    <div class="col-sm-3">
                        <input class="form-control" type="text" name="salesPrice" placeholder="请输入信息"/>
                    </div>

                    <label class="col-sm-1 control-label" for="ds_name">生效日期</label>
                    <div class="col-sm-3">
                        <input class="form-control" type="date"  name="salesPriceSdate"/>
                    </div>

                    <label class="col-sm-1 control-label" for="ds_username">失效日期</label>
                    <div class="col-sm-3">
                        <input class="form-control" type="date"  name="salesPriceEdate"/>
                    </div>

                </div>

            </fieldset>
            <fieldset>
                <div class="form-group">

                    <label class="col-sm-2 control-label" for="ds_host"></label>
                    <div class="col-sm-2">
                        <input type="submit" value="返回" class="btn btn-success"
                               onclick="javascript:history.back();"/>
                    </div>

                    <label class="col-sm-2 control-label" for="ds_host"></label>
                    <div class="col-sm-2">
                        <input type="submit" value="提交" class="btn btn-primary"/>
                    </div>

                    <label class="col-sm-2 control-label" for="ds_host"></label>
                    <div class="col-sm-2">
                        <input type="reset" value="重置" class="btn btn-danger" id="resetForm"/>
                    </div>

                </div>
            </fieldset>
        </form>
    </div>
</div>
</body>
<script type="text/javascript" src="${path }/static/js/plugins/file-input/fileinput.min.js"></script>
<script type="text/javascript" src="./js/dictionary.js"></script>
</html>