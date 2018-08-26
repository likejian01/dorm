<div id="dorm_manage_layout" class="easyui-layout" style="width:1300px;height:450px;">
    <div data-options="region:'north',title:'查询面板',split:true" style="height:145px;">
        <form id="dorm_manage_query_form" method="post" class="query_form">
            <div class="query_form_div">
                <div class="query_form_div_label"><label for="dorm_code" >宿舍编号:</label></div>
                <input class="easyui-validatebox" type="text" name="dorm_code" />
            </div>
            <div class="query_form_div">
                <div class="query_form_div_label"><label for="dorm_sex" >宿舍性别:</label></div>
                <input class="easyui-validatebox" type="text" name="dorm_sex"  />
            </div>
            <div class="query_form_div">
                <div class="query_form_div_label"><label for="dorm_type" >宿舍规格:</label></div>
                <input class="easyui-validatebox" type="text" name="dorm_type"  />
            </div>
            <div class="query_form_div">
                <div class="query_form_div_label"><label for="dorm_leader_name" >宿舍长:</label></div>
                <input class="easyui-validatebox" type="text" name="dorm_leader_name" data-options="validType:'email'" />
            </div>
            </br>
            <div class="query_form_div">
                <div class="query_form_div_label"><label for="createtime[from]" >创建时间从:</label></div>
                <input class="easyui-validatebox" type="text" name="createtime[from]" data-options="required:true" />
            </div>
            <div class="query_form_div">
               <div class="query_form_div_label"><label for="createtime[to]" >至:</label></div>
                <input class="easyui-validatebox" type="text" name="createtime[to]" />
            </div>
            </br>
            <div class="query_form_btn_div">
               <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'" style="width:80px">查询</a>
               <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-reload'" style="width:80px">重置</a>
            </div>
        </form>

    </div>
    <div data-options="region:'center',title:'数据展示'" style="padding:5px;background:#eee;"></div>
</div>
