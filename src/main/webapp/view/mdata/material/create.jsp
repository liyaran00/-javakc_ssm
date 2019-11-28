<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>测试管理添加页面</title>
    <%@ include file="../../../common/jsp/header.jsp"%>
    <link href="${path }/static/css/plugins/file-input/fileinput.min.css" rel="stylesheet">
</head>
<body>
<div class="wrapper wrapper-content animated fadeInRight">
    <div>
        <div class="col-sm-4"><input type="button" value="返回上一页" class="btn btn-success" onclick="javascript:history.back();"/></div>
    </div>
    <div class="ibox float-e-margins">
        <form action="${path }/mdata/material/create.do" method="post" class="form-horizontal" role="form">
            <fieldset>
                <legend>测试管理基本信息</legend>
                    <div class="form-group">
<%--                        <label class="col-sm-2 control-label" for="ds_name">物资编码</label>--%>
<%--                        <div class="col-sm-4">--%>
<%--                            <input class="form-control" type="text" name="testName" placeholder="物资编码"/>--%>
<%--                        </div>--%>

                        <label class="col-sm-2 control-label" for="material_Name">物资名称</label>
                        <div class="col-sm-4">
                            <input class="form-control" type="text" name="materialName" placeholder="物资名称"/>
                        </div>
                    </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label" for="material_Nano">物资简称</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="materialNano" placeholder="物资简称"/>
                    </div>

                    <label class="col-sm-2 control-label" for="material_Standard">规格</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="materialStandard" placeholder="规格"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="material_Standard">物资分类</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="materialStandard" placeholder="物资分类"/>
                     </div>
                </div>
<%--                    <label class="col-sm-2 control-label" for="ds_name">基本单位</label>--%>
<%--                    <div class="col-sm-4">--%>
<%--                        <input class="form-control" type="text" name="testName" placeholder="基本单位"/>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="form-group">--%>
<%--                    <label class="col-sm-2 control-label" for="ds_name">状态</label>--%>
<%--                    <div class="col-sm-4">--%>
<%--                         <input class="form-control" type="text" name="testName" placeholder="状态"/>--%>
<%--                    </div>--%>

<%--                    <label class="col-sm-2 control-label" for="ds_name">创建人</label>--%>
<%--                    <div class="col-sm-4">--%>
<%--                        <input class="form-control" type="text" name="testName" placeholder="创建人"/>--%>
<%--                    </div>--%>
<%--                </div>--%>

            </fieldset>
            <fieldset>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="ds_host"></label>
                    <div class="col-sm-4">
                        <input type="submit" value="提交" class="btn btn-primary"/>
                    </div>
                    <label class="col-sm-2 control-label" for="ds_host"></label>
                    <div class="col-sm-4">
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