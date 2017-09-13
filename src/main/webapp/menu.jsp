<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <title>大聪明</title>
    <link rel="stylesheet" href="css/basic.css" type="text/css"/>
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="js/basic.js"></script>
    <script type="text/javascript" src="js/jquery-form.js"></script>
    <script type="text/javascript">
	    $.ajaxSetup ({ 
	        cache: false //关闭AJAX相应的缓存 
	    }); 
	    $(function(){
	    	$(".main").load("storeMenu.do");
	        $(".sidebar_left .menu_left  li").css({"background-color":""});
	        $("#load_store_menu").css({"background-color":"#53d76f"});
	    	//点击页面跳转
	        $("#itemApprove").click(function(){
	          $(".main").load("itemApprove.do");
	          $(".sidebar_left .menu_left  li").css({"background-color":""});
	          $(this).css({"background-color":"#53d76f"});
	        });
	        
	        $("#orderService").click(function(){
		          $(".main").load("orderService.do");
		          $(".sidebar_left .menu_left  li").css({"background-color":""});
		          $(this).css({"background-color":"#53d76f"});
	        });
	        
	        $("#uploadBanner").click(function(){
		          $(".main").load("uploadBanner.do"); 
		          $(".sidebar_left .menu_left  li").css({"background-color":""});
		          $(this).css({"background-color":"#53d76f"});
		          sessionStorage.clear();
	        });
	        
	       	//点击变成手指样式
	        $("ul").on("mouseover","li", function(){
	    		changHand(this);
	    	});
	      });
    </script>
  </head>
  <body>
    <div class="wrapper">
      <div class="sidebar_left">
      	<div id="logo_bar">
      		<img id="logo" src="img/menu/dianpu_03.png"/>
      	</div>
        <ul class="menu_left">
          <li id="itemApprove"><div><img  src="img/menu/dianpu_09.png"/></div><div><span>商品审核</span></div></li>
          <li id="orderService"><div><img  src="img/menu/dianpu_09.png"/></div><div><span>订单服务</span></div></li>
          <li id="uploadBanner"><div><img  src="img/menu/tubiao_14.png"/></div><div><span>上传banner</span></div></li>
        </ul>
      </div>
      <div class="sidebar_right">
        <div class="header_right">
        	<ul id="rheader_list">
        		<li id="outlogin">退出登录</li>
        	</ul>
        </div>
        <div class="main">
        </div>
      </div>
    </div>
    <div id="DialogDiv">
    </div>
  </body>
</html>