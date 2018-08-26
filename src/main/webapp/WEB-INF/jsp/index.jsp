<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<meta name="copyright" content="宿舍管理系统"/>
<title>宿舍管理系统</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/easyui/jquery-easyui-1.5.5.5/themes/default/easyui.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/easyui/jquery-easyui-1.5.5.5/themes/icon.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/easyui/jquery-easyui-1.5.5.5/demo/demo.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/wu.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/icon.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }css/layuiform/query_form.css"/>
<script type="text/javascript" src="https://code.jquery.com/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/easyui/jquery-easyui-1.5.5.5/jquery.easyui.min.js"></script>
<script charset="gbk" type="text/javascript" src="${pageContext.request.contextPath }/easyui/jquery-easyui-1.5.5.5/locale/easyui-lang-zh_CN.js" ></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/easyui/jquery-easyui-1.5.5.5/jquery.edatagrid.js"></script>
</head>
<body class="easyui-layout">
	<!-- begin of header -->
	<div class="wu-header" data-options="region:'north',border:false,split:true">
    	<div class="wu-header-left">
        	<h1>宿舍管理系统</h1>
        </div>
        <div class="wu-header-right">
        	<p><strong class="easyui-tooltip" title="2条未读消息">admin</strong>，欢迎您！</p>
            <p><a href="#">网站首页</a>|<a href="#">支持论坛</a>|<a href="#">帮助中心</a>|<a href="#">安全退出</a></p>
        </div>
    </div>
  <!-- end of header -->
  <!-- begin of sidebar -->
	<div class="wu-sidebar" data-options="region:'west',split:true,border:true,title:'导航菜单'">
    	<div class="easyui-accordion" data-options="border:false,fit:true">
        	<div title="快捷菜单" data-options="iconCls:'icon-application-cascade'" style="padding:5px;">
    			<ul class="easyui-tree wu-side-tree">
                	<%--<li iconCls="icon-chart-organisation"><a href="javascript:void(0)" data-icon="icon-chart-organisation" data-link="menu/home" iframe="0">菜单导航</a></li>--%>
                    <li iconCls="icon-users"><a href="javascript:void(0)" data-icon="icon-users" data-link="menu/dorm_manage" iframe="0">宿舍管理</a></li>
                    <li iconCls="icon-user-group"><a href="javascript:void(0)" data-icon="icon-user-group" data-link="menu/staff_manage" iframe="0">员工管理</a></li>
                    <li iconCls="icon-book"><a href="javascript:void(0)" data-icon="icon-book" data-link="menu/fee_manage" iframe="0">水电费管理</a></li>
                  <%--  <li iconCls="icon-cog"><a href="javascript:void(0)" data-icon="icon-cog" data-link="menu/layout-3.html" iframe="0">系统参数</a></li>
                    <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" data-icon="icon-application-osx-error" data-link="menu/layout-3.html" iframe="0">操作日志</a></li>--%>
                </ul>
            </div>
            <div title="内容管理" data-options="iconCls:'icon-application-form-edit'" style="padding:5px;">
    			<ul class="easyui-tree wu-side-tree">
                	<li iconCls="icon-chart-organisation"><a href="javascript:void(0)" data-icon="icon-chart-organisation" data-link="layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-users"><a href="javascript:void(0)" data-icon="icon-users" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-user-group"><a href="javascript:void(0)" data-icon="icon-user-group" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-book"><a href="javascript:void(0)" data-icon="icon-book" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-cog"><a href="javascript:void(0)" data-icon="icon-cog" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" data-icon="icon-application-osx-error" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                </ul>
            </div>
            <div title="商品管理" data-options="iconCls:'icon-creditcards'" style="padding:5px;">
    			<ul class="easyui-tree wu-side-tree">
                	<li iconCls="icon-chart-organisation"><a href="javascript:void(0)" data-icon="icon-chart-organisation" data-link="layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-users"><a href="javascript:void(0)" data-icon="icon-users" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-user-group"><a href="javascript:void(0)" data-icon="icon-user-group" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-book"><a href="javascript:void(0)" data-icon="icon-book" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-cog"><a href="javascript:void(0)" data-icon="icon-cog" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" data-icon="icon-application-osx-error" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                </ul>
            </div>
            <div title="订单管理" data-options="iconCls:'icon-cart'" style="padding:5px;">
    			<ul class="easyui-tree wu-side-tree">
                	<li iconCls="icon-chart-organisation"><a href="javascript:void(0)" data-icon="icon-chart-organisation" data-link="layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-users"><a href="javascript:void(0)" data-icon="icon-users" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-user-group"><a href="javascript:void(0)" data-icon="icon-user-group" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-book"><a href="javascript:void(0)" data-icon="icon-book" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-cog"><a href="javascript:void(0)" data-icon="icon-cog" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" data-icon="icon-application-osx-error" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                </ul>
            </div>
            <div title="广告管理" data-options="iconCls:'icon-bricks'" style="padding:5px;">
    			<ul class="easyui-tree wu-side-tree">
                	<li iconCls="icon-chart-organisation"><a href="javascript:void(0)" data-icon="icon-chart-organisation" data-link="layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-users"><a href="javascript:void(0)" data-icon="icon-users" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-user-group"><a href="javascript:void(0)" data-icon="icon-user-group" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-book"><a href="javascript:void(0)" data-icon="icon-book" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-cog"><a href="javascript:void(0)" data-icon="icon-cog" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" data-icon="icon-application-osx-error" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                </ul>
            </div>
            <div title="报表中心" data-options="iconCls:'icon-chart-curve'" style="padding:5px;">
    			<ul class="easyui-tree wu-side-tree">
                	<li iconCls="icon-chart-organisation"><a href="javascript:void(0)" data-icon="icon-chart-organisation" data-link="layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-users"><a href="javascript:void(0)" data-icon="icon-users" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-user-group"><a href="javascript:void(0)" data-icon="icon-user-group" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-book"><a href="javascript:void(0)" data-icon="icon-book" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-cog"><a href="javascript:void(0)" data-icon="icon-cog" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" data-icon="icon-application-osx-error" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                </ul>
            </div>
            <div title="系统设置" data-options="iconCls:'icon-wrench'" style="padding:5px;">
    			<ul class="easyui-tree wu-side-tree">
                	<li iconCls="icon-chart-organisation"><a href="javascript:void(0)" data-icon="icon-chart-organisation" data-link="layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-users"><a href="javascript:void(0)" data-icon="icon-users" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-user-group"><a href="javascript:void(0)" data-icon="icon-user-group" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-book"><a href="javascript:void(0)" data-icon="icon-book" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-cog"><a href="javascript:void(0)" data-icon="icon-cog" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                    <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" data-icon="icon-application-osx-error" data-link="menu/layout-3.html" iframe="0">导航标题</a></li>
                </ul>
            </div>
        </div>
    </div>
  <!-- end of sidebar -->
  <!-- begin of main -->
    <div class="wu-main" data-options="region:'center'">
        <div id="wu-tabs" class="easyui-tabs" data-options="border:false,fit:true">
            <%--<div title="首页" data-options="href:'menu/layout-1.html',closable:false,iconCls:'icon-tip',cls:'pd3'"></div>--%>
            <div title="首页" data-options="href:'menu/dorm_manage',closable:false,iconCls:'icon-tip',cls:'pd3'"></div>
        </div>
    </div>
  <!-- end of main -->
  <!-- begin of footer -->
	<div class="wu-footer" data-options="region:'south',border:true,split:true">
    	&copy; 2018 likejian All Rights Reserved
    </div>
  <!-- end of footer -->
    <script type="text/javascript">
		$(function () {
        $('.wu-side-tree a').bind("click", function () {
            var title = $(this).text();
            var url = $(this).attr('data-link');
            var iconCls = $(this).attr('data-icon');
            var iframe = $(this).attr('iframe') == 1 ? true : false;
            addTab(title, url, iconCls, iframe);
        });
    })

    /**
     * Name 载入树形菜单
     */
    $('#wu-side-tree').tree({
        url: 'menu/menu.php',
        cache: false,
        onClick: function (node) {
            var url = node.attributes['url'];
            if (url == null || url == "") {
                return false;
            }
            else {
                addTab(node.text, url, '', node.attributes['iframe']);
            }
        }
    });

    /**
     * Name 选项卡初始化
     */
    $('#wu-tabs').tabs({
        tools: [{
            iconCls: 'icon-reload',
            border: false,
            handler: function () {
                $('#wu-datagrid').datagrid('reload');
            }
        }]
    });

    /**
     * Name 添加菜单选项
     * Param title 名称
     * Param href 链接
     * Param iconCls 图标样式
     * Param iframe 链接跳转方式（true为iframe，false为href）
     */
    function addTab(title, href, iconCls, iframe) {
        var tabPanel = $('#wu-tabs');
        if (!tabPanel.tabs('exists', title)) {
            var content = '<iframe scrolling="auto" frameborder="0"  src="' + href + '" style="width:100%;height:100%;"></iframe>';
            if (iframe) {
                tabPanel.tabs('add', {
                    title: title,
                    content: content,
                    iconCls: iconCls,
                    fit: true,
                    cls: 'pd3',
                    closable: true
                });
            }
            else {
                tabPanel.tabs('add', {
                    title: title,
                    href: href,
                    iconCls: iconCls,
                    fit: true,
                    cls: 'pd3',
                    closable: true
                });
            }
        }
        else {
            tabPanel.tabs('select', title);
        }
    }

    /**
     * Name 移除菜单选项
     */
    function removeTab() {
        var tabPanel = $('#wu-tabs');
        var tab = tabPanel.tabs('getSelected');
        if (tab) {
            var index = tabPanel.tabs('getTabIndex', tab);
            tabPanel.tabs('close', index);
        }
    }
	</script>
</body>
</html>
