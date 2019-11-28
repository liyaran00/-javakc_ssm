<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>供应商管理添加页面</title>
    <%@ include file="../../../common/jsp/header.jsp" %>
    <link href="${path }/static/css/plugins/file-input/fileinput.min.css" rel="stylesheet">
</head>
<body>
<div class="wrapper wrapper-content animated fadeInRight">
    <div>
        <div class="col-sm-4"><input type="button" value="返回上一页" class="btn btn-success"
                                     onclick="javascript:history.back();"/></div>
    </div>
    <div class="ibox float-e-margins">
        <form action="${path}/supplier/createSupplier.do" method="post" class="form-horizontal" role="form">
            <fieldset>
                <legend>供应商管理基本信息</legend>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="ds_host">供应商类型</label>
                    <div class="col-sm-4">
                        <select class="form-control" id="supplierType" name="supplierType" value="${supplierEntity.supplierType}" onchange="SupplierShowHide()">
                            <option selected="selected">外部供应商</option>
                            <option>内部供应商</option>
                        </select>
                    </div>
                </div>
                <div class="form-group" style="display: none;" id="divSupplierType">
                    <label class="col-sm-2 control-label" for="ds_host">供应商内部组织</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="orgId"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="ds_host">供应商名称</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="supplierName" required="required"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="ds_host">供应商分类</label>
                    <div class="col-sm-4">
                    <select class="form-control" id="supplierClassify" name="supplierClassify" value="${supplierEntity.supplierClassify}">
                        <option>一类</option>
                        <option>二类</option>
                        <option>三类</option>
                    </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="ds_host">供应商简称</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="supplierAcronym" required="required"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="ds_host">法人</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="supplierMan" required="required"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="ds_host">法人电话</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="supplierManPhone" required="required"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="ds_host">供应商地址</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="supplierAddress" required="required"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="ds_host">社会统一信任码</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="supplierCoding" required="required"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="ds_host">联系人</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="supplierLinkman" required="required"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="ds_host">联系人电话</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="supplierLinkmanPhone" required="required"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="ds_host">联系邮箱</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="supplierLinkmanEmail" required="required"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="ds_host">启用门户</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="radio" name="supplierIsGateway" aria-label="supplierIsGateway" value="1"/>是
                        <input class="form-control" type="radio" name="supplierIsGateway" aria-label="supplierIsGateway" value="0"/>否
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="ds_host">必须合同</label>
                    <div class="col-sm-2">
                        <input class="form-control" type="radio" name="supplierIsContract" aria-label="supplierIsContract" value="1"/>是
                        <input class="form-control" type="radio" name="supplierIsContract" aria-label="supplierIsContract" value="0"/>否
                    </div>
                </div>
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
<script type="text/javascript">
    function SupplierShowHide() {
        var options=$("#supplierType option:selected")
        var val=options.val();//拿到选中项的值
        if(val=='内部供应商'){
            $("#divSupplierType").show();
        }else{
            $("#divSupplierType").hide();
        }
    }
</script>

</html>