<%--
  Created by IntelliJ IDEA.
  User: xzc
  Date: 2024/10/18
  Time: 06:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>发表问题</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="css/head.css"/>
    <link rel="stylesheet" href="layui/css/layui.css">

    <link rel="stylesheet" href="css/global.css">

    <script src="layui/layui.js"></script>
</head>
<body>

<div class="dvhead">
    <div class="dvlogo"><a href="index.html">你问我答</a></div>
    <div class="dvsearch">10秒钟注册账号，找到你的同学</div>
    <div class="dvreg">
        已有账号，立即&nbsp;<a href="login.html">登录</a>
    </div>
</div>

<div class="main layui-clear">
    <div class="fly-panel" pad20>
        <h2 class="page-title">发表问题</h2>

        <!-- <div class="fly-none">并无权限</div> -->

        <div class="layui-form layui-form-pane">
            <form action="${pageContext.request.contextPath}/pasteAction_addPaste">
                <div class="layui-form-item">
                    <label for="L_title" class="layui-form-label">标题</label>
                    <div class="layui-input-block">
                        <input type="text" id="L_title" name="title" required lay-verify="required" autocomplete="off"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item layui-form-text">
                    <div class="layui-input-block">
                        <div class="editor">
                            <textarea id="content" name="content"
                                      style="width:1040px;height:450px;visibility:hidden;"></textarea>
                        </div>
                    </div>
                    <label for="L_content" class="layui-form-label" style="top: -2px;">描述</label>
                </div>
                <div class="layui-form-item">
                    <label for="L_title" class="layui-form-label">悬赏</label>
                    <div class="layui-input-block">
                        <input type="number" name="offer" required lay-verify="required" autocomplete="off"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <button class="layui-btn" lay-filter="*" lay-submit>立即发布</button>
                </div>
            </form>
        </div>
    </div>
</div>

<script type="text/javascript" charset="utf-8" src="js/kindeditor.js"></script>
<script type="text/javascript">
    KE.show({
        id: 'content',
        resizeMode: 1,
        cssPath: './index.css',
        items: [
            'fontname', 'fontsize', 'textcolor', 'bgcolor', 'bold', 'italic', 'underline',
            'removeformat', 'justifyleft', 'justifycenter', 'justifyright', 'insertorderedlist',
            'insertunorderedlist', 'emoticons', 'image', 'link']
    });
</script>
<script>

    layui.cache.page = '';
    layui.cache.user = {
        username: '游客'
        , uid: -1
        , avatar: '../res/images/avatar/00.jpg'
        , experience: 83
        , sex: '男'
    };
    layui.config({
        version: "2.0.0"
        , base: '../res/mods/'
    }).extend({
        fly: 'index'
    }).use('fly');
</script>
</body>
</html>
