<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>物资数据修改页面</title>
		<%@ include file="../../../common/jsp/header.jsp"%>
		<link href="${path }/static/css/plugins/file-input/fileinput.min.css" rel="stylesheet">
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">
			<div>
				<div class="col-sm-4"><input type="button" value="返回上一页" class="btn btn-success" onclick="javascript:history.back();"/></div>
			</div>
			<div class="ibox float-e-margins">
				<form action="${path }material/update.do" method="post" class="form-horizontal" role="form">
					<input type="hidden" id="materialId" name="materialId" value="${materialEntity.materialId}"/>
                    <fieldset>
                        <legend>物资修改基本信息</legend>
                       <div class="form-group">
                          <label class="col-sm-2 control-label" for="MATERIAL_NAME">物资名称</label>
                          <div class="col-sm-4">
                             <input class="form-control" type="text" name="materialName" placeholder="物资名称" value="${testEntity.testName}"/>
                          </div>
						   <label class="col-sm-2 control-label" for="MATERIAL_NANO">物资简称</label>
						   <div class="col-sm-4">
							   <input class="form-control" type="text" name="materialNano" placeholder="物资简称" value="${testEntity.testName}"/>
						   </div>
                       </div>
						<div class="form-group">
						<label class="col-sm-2 control-label" for="MATERIAL_STANDARD">规格</label>
						<div class="col-sm-4">
							<input class="form-control" type="text" name="materialStandard" placeholder="规格" value="${testEntity.testName}"/>
						</div>
						<label class="col-sm-2 control-label" for="CATEGORY_ID">物资类型</label>
						<div class="col-sm-4">
							<input class="form-control" type="text" name="categoryId" placeholder="物资类型" value="${testEntity.testName}"/>
						</div>
					</div>
						<div class="form-group">
							<label class="col-sm-2 control-label" for="MATERIAL_BASE_UNIT">基本单位</label>
							<div class="col-sm-4">
								<input class="form-control" type="text" name="materialBaseUnit" placeholder="基本单位" value="${testEntity.testName}"/>
							</div>
							<label class="col-sm-2 control-label" for="MATERIAL_STATE">状态</label>
							<div class="col-sm-4">
								<input class="form-control" type="text" name="materialState" placeholder="状态" value="${testEntity.testName}"/>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label" for="creator">创建人</label>
							<div class="col-sm-4">
								<input class="form-control" type="text" name="creator" placeholder="创建人" value="${testEntity.testName}"/>
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
</html>