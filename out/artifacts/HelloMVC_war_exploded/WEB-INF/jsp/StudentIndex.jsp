<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="pojo.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.fdh-top {
    height: 100px;
}

.fdh-t-name {
    display: inline-block;
    width: 100%;
    height: 60px;
    line-height: 60px;
}

.fdh-t-ename {
    font-size: 17px;
}

.fdh-t-link {
    text-align: right;
    font-size: 12px;
    height: 20px;
    margin: 15px 0 5px 0;
}

.fdh-t-link span {
    display: inline-block;
    padding: 0 10px;
    border-right: 2px solid #aaa;
}

.fdh-t-link span:nth-child(3) {
    border-right: 0;
}

.fdh-t-search {
    width: 230px;
    height: 40px;
    border: 1px solid #ddd;
    border-radius: 40px;
    float: right;
}

.fdh-t-search input {
    height: 33px;
    border: 0;
    margin: 3px 0 0 15px;
    border-right: 1px solid #ddd;
}

.fdh-t-search span {
    font-size: 17px;
    color: #aaa;
    position: relative;
    top: 4px;
    left: 5px;
}

.fdh-title {
    width: 100%;
    background-color: #174665;
    color: #fff;
}

.fdh-title-list > li > a {
    color: #ffffff;
    font-weight: bold;
}

.fdh-title-list > li > a:hover {
    color: #141576;
    font-weight: bold;
}

.fd-f-link {
    width: 100%;
    background-color: #ededed;
    padding: 20px 0 40px;
}

.fd-fl-title {
    border-bottom: 1px solid #aaa;
    margin: 0px 10px 20px;
    padding: 5px 0;
}

.fd-flt-span1 {
    color: #174765;
    font-weight: bold;
}

.fd-flt-span2 {
    color: #aaa;
}

.fd-fl-title span:nth-child(1) {
    color: #174765;
    font-weight: bold;
}

.fd-fl-title span:nth-child(2) {
    color: #aaa;
}

.fd-f-bottom {
    width: 100%;
    background-color: #174765;
    height: 93px;
}

.fd-fb-logo {
    float: left;
    width: 30%;
}

.fd-fb-public {
    float: right;
    text-align: right;
    width: 70%;
    color: #fff;
    font-size: 12px;
}

.fd-fbp-span1 {
    display: inline-block;
    width: 100%;
    margin: 20px 0;
}

.fd-fbp-span2 {
    display: inline-block;
    width: 100%;
}

.fd-fb-public span:nth-child(1) {
    display: inline-block;
    width: 100%;
    margin: 20px 0;
}

.fd-fb-public span:nth-child(2) {
    display: inline-block;
    width: 100%;
}

ul {
    list-style-type: none;
    padding: 0;
    margin: 0;
}
.accordion {
    width: 100%;
    max-width: 360px;
    margin: 0 auto 20px;
    background: #bbcfdc;
    /*-webkit-border-radius: 4px;*/
    /*-moz-border-radius: 4px;*/
    /*border-radius: 4px;*/
}

.accordion .link {
    cursor: pointer;
    display: block;
    padding: 15px 15px 15px 42px;
    color: #4D4D4D;
    font-size: 14px;
    font-weight: 700;
    border-bottom: 1px solid #000;
    position: relative;
    -webkit-transition: all 0.4s ease;
    -o-transition: all 0.4s ease;
    transition: all 0.4s ease;
}

.accordion li:last-child .link {
    border-bottom: 0;
}

.accordion li i {
    position: absolute;
    top: 15px;
    left: 12px;
    font-size: 18px;
    color: #595959;
    -webkit-transition: all 0.4s ease;
    -o-transition: all 0.4s ease;
    transition: all 0.4s ease;
}

.accordion li i.fa-chevron-down {
    right: 12px;
    left: auto;
    font-size: 16px;
}

.accordion li.open .link {
    color: #fff;
    background-color: #174765;
}

.accordion li.open i {
    color: #aaa;
}
.accordion li.open i.fa-chevron-down {
    -webkit-transform: rotate(180deg);
    -ms-transform: rotate(180deg);
    -o-transform: rotate(180deg);
    transform: rotate(180deg);
}

/**
 * Submenu
 -----------------------------*/
.submenu {
    display: none;
    background-color: #fff;
    font-size: 14px;
}

.submenu li {
    border-bottom: 1px solid #4b4a5e;
    position: relative;
}

.submenu a {
    display: block;
    text-decoration: none;
    color: #333;
    padding: 12px;
    padding-left: 42px;
    -webkit-transition: all 0.25s ease;
    -o-transition: all 0.25s ease;
    transition: all 0.25s ease;
}

.submenu a:hover {
    background-color: #f0f0f0;
    color: #333;
}

.carousel-inner > .item > a > img, .carousel-inner > .item > img {
    width: 100%;
    margin-left: auto;
    margin-right: auto;
}

.dropdown-submenu {
    position: relative;
}

.dropdown-submenu > .dropdown-menu {
    top: 0;
    left: 100%;
    margin-top: -6px;
    margin-left: -1px;
    -webkit-border-radius: 0 6px 6px 6px;
    -moz-border-radius: 0 6px 6px;
    border-radius: 0 6px 6px 6px;
}

.dropdown-submenu:hover > .dropdown-menu {
    display: block;
}

.dropdown-submenu > a:after {
    display: block;
    content: " ";
    float: right;
    width: 0;
    height: 0;
    border-color: transparent;
    border-style: solid;
    border-width: 5px 0 5px 5px;
    border-left-color: #ccc;
    margin-top: 5px;
    margin-right: -10px;
}

.dropdown-submenu:hover > a:after {
    border-left-color: #fff;
}

.dropdown-submenu.pull-left {
    float: none;
}

.dropdown-submenu.pull-left > .dropdown-menu {
    left: -100%;
    margin-left: 10px;
    -webkit-border-radius: 6px 0 6px 6px;
    -moz-border-radius: 6px 0 6px 6px;
    border-radius: 6px 0 6px 6px;
}


</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>软件工程精品课</title>
<link type="text/css" rel="stylesheet" href="../css/bootstrap-theme.css" />
<link type="text/css" rel="stylesheet" href="../css/bootstrap-theme.css.map" />
<link type="text/css" rel="stylesheet" href="../css/bootstrap-theme.min.css" />
<link type="text/css" rel="stylesheet" href="../css/bootstrap-theme.min.css.map" />
<link type="text/css" rel="stylesheet" href="../css/bootstrap.css" />
<link type="text/css" rel="stylesheet" href="../css/bootstrap.css.map" />
<link type="text/css" rel="stylesheet" href="../css/bootstrap.min.css" />
<link type="text/css" rel="stylesheet" href="../css/bootstrap.min.css.map" />

<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/bootstarp.js"></script>
<script type="text/javascript" src="../js/npm.js"></script>

  <!-- CSS
  ================================================== -->
  <!-- RS5.0 Main Stylesheet -->
  <link rel="stylesheet" type="text/css" href="../plugins/revo-slider/css/settings.css">
  <!-- RS5.0 Layers and Navigation Styles -->
  <link rel="stylesheet" type="text/css" href="../plugins/revo-slider/css/layers.css">
  <link rel="stylesheet" type="text/css" href="../plugins/revo-slider/css/navigation.css">
  <!-- REVOLUTION STYLE SHEETS -->
  <link rel="stylesheet" type="text/css" href="../plugins/revo-slider/fonts/pe-icon-7-stroke/css/pe-icon-7-stroke.css">
  <link rel="stylesheet" type="text/css" href="../plugins/revo-slider/fonts/font-awesome/css/font-awesome.min.css">
  <link rel="stylesheet" type="text/css" href="../plugins/revo-slider/css/settings.css">
  <link rel="stylesheet" type="text/css" href="../plugins/revo-slider/css/layers.css">
  <link rel="stylesheet" type="text/css" href="../plugins/revo-slider/css/navigation.css"> 
  <!-- Themefisher Icon font -->
  <link rel="stylesheet" href="../plugins/themefisher-font/style.css">
  <!-- bootstrap.min css -->
  <link rel="stylesheet" href="../plugins/bootstrap/css/bootstrap.min.css">
  <!-- Lightbox.min css -->
  <link rel="stylesheet" href="../plugins/lightbox2/dist/css/lightbox.min.css">
  <!-- Slick Carousel -->
  <link rel="stylesheet" href="../plugins/slick-carousel/slick/slick.css">
  <link rel="stylesheet" href="../plugins/slick-carousel/slick/slick-theme.css">
  <!-- Main Stylesheet -->
  <link rel="stylesheet" href="../css/style.css">


  <!-- Colors -->
  <link rel="stylesheet" type="text/css" href="../css/colors/green.css" title="green">
  <link rel="stylesheet" type="text/css" href="../css/colors/red.css" title="light-red">
  <link rel="stylesheet" type="text/css" href="../css/colors/blue.css" title="blue">
  <link rel="stylesheet" type="text/css" href="../css/colors/light-blue.css" title="light-blue">
  <link rel="stylesheet" type="text/css" href="../css/colors/yellow.css" title="yellow">
  <link rel="stylesheet" type="text/css" href="../css/colors/light-green.css" title="light-green">





</head>
<body>
<div class="container-fluid">
	<div class="row">
		<div class="span12">
		 <p class="bg-primary">欢迎您：${user.id}，${user.name}同学
		 	<a href="/HelloMVC/user/logout" class="pull-right bg-primary">登出</a>
		 </p>
		
			<h3>
				软件工程精品课
			</h3>
			<ul class="nav nav-tabs"  bgcolor="#3f51b6">
				<li class="active">
					<a href="<%=request.getContextPath()%>/student/StudentIndex.jsp">课程主页</a>
				</li>
				<li>
					<a href="<%=request.getContextPath()%>/student/stu_homework.jsp">习题作业</a>
				</li>
				<li class="">
					<a href="<%=request.getContextPath()%>/student/stu_experience.action?id=${USER}">实验教学</a>
				</li>
				<li>
					<a href="<%=request.getContextPath()%>/student/stu_resource.jsp">资源下载</a>
				</li>
				<li>
					<a href="#">在线练习</a>
				</li>
				<li>
					<a href="#">学习社区</a>
				</li>
				<li class="dropdown pull-right">
					 <a href="#" data-toggle="dropdown" class="dropdown-toggle">个人中心<strong class="caret"></strong></a>
					<ul class="dropdown-menu">
						<li>
							<a href="#">操作</a>
						</li>
						<li>
							<a href="#">设置栏目</a>
						</li>
						<li>
							<a href="#">更多设置</a>
						</li>
						<li class="divider">
						</li>
						<li>
							<a href="#">分割线</a>
						</li>
					</ul>
				</li>
			</ul>
		</div>
	</div>
	
<!-- Static navbar -->


      <!-- Main component for a primary marketing message or call to action -->
      <div class="row">
      <div class="jumbotron">
        <h1>Hello! Software Engineering! </h1>
        <p>软件工程是一门研究用工程化方法构建和维护有效的、实用的和高质量的软件的学科。它涉及程序设计语言、数据库、软件开发工具、系统平台、标准、设计模式等方面。</p>
        <p>
          <a class="btn btn-lg btn-primary" href="../document/course_outline.docx" role="button">查看大纲! &raquo;</a>
        </p>
      </div> 
      </div>
	</div>
	
	
<!-- Start Testimonial
=========================================== -->
		
	<section class="testimonial section" id="testimonial">
		<div class="container">
			<div class="row">				
				<div class="col-lg-12">
					<!-- testimonial wrapper -->
					<div class="testimonial-slider">
						<!-- testimonial single -->
						<div class="item text-center">
							<i class="tf-ion-chatbubbles"></i>
							<!-- client info -->
							<div class="client-details">
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eum nulla, soluta dolorum. Eos earum, magni asperiores, unde corporis labore, enim, voluptatum officiis voluptates alias natus. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quia, officia. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod, quia?</p>
							</div>
							<!-- /client info -->
							<!-- client photo -->
							<div class="client-thumb">
								<img src="../images/client-logo/clients-1.jpg" class="img-responsive" alt="">
							</div>
							<div class="client-meta">
								<h3>单红</h3>
								<span>Teacher , Fuzhou University</span>
							</div>
							<!-- /client photo -->
						</div>
						<!-- /testimonial single -->
				
						<!-- testimonial single -->
						<div class="item text-center">
							<i class="tf-ion-chatbubbles"></i>
							<!-- client info -->
							<div class="client-details">
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eum nulla, soluta dolorum. Eos earum, magni asperiores, unde corporis labore, enim, voluptatum officiis voluptates alias natus. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quia, officia. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod, quia?</p>
							</div>
							<!-- /client info -->
							<!-- client photo -->
							<div class="client-thumb">
								<img src="../images/client-logo/clients-1.jpg" class="img-responsive" alt="">
							</div>
							<div class="client-meta">
								<h3>汪景玢</h3>
								<span>Teacher , Fuzhou University</span>
							</div>
							<!-- /client photo -->
						</div>
						<!-- /testimonial single -->
					
						<!-- testimonial single -->
						<div class="item text-center">
							<i class="tf-ion-chatbubbles"></i>
							<!-- client info -->
							<div class="client-details">
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eum nulla, soluta dolorum. Eos earum, magni asperiores, unde corporis labore, enim, voluptatum officiis voluptates alias natus. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quia, officia. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod, quia?</p>
							</div>
							<!-- /client info -->
							<!-- client photo -->
							<div class="client-thumb">
								<img src="../images/client-logo/clients-1.jpg" class="img-responsive" alt="">
							</div>
							<div class="client-meta">
								<h3>Abul Mal Muhit</h3>
								<span>CEO , Company Name</span>
							</div>
							<!-- /client photo -->
						</div>
						<!-- /testimonial single -->
					</div>
				</div> 		<!-- end col lg 12 -->
			</div>	    <!-- End row -->
		</div>       <!-- End container -->
	</section>    <!-- End Section -->
	
	
	
	
	
	
	
	
	
  
 <div class="fd-f-link">
    <div class="container">
        <div class="fd-fl-title">
            <span class="fd-flt-span1">友情链接</span>
            <span class="fd-flt-span2">Friendship Link</span>
        </div>
        <div>
            
                <a href="http://www.fzu.edu.cn/" target="view_window" style="margin-left: 40px">
                    <img style="width: 20%; height: 10%" src="../picture/footer01.PNG">
                </a>
            
                <a href="http://jwch.fzu.edu.cn/" target="view_window" style="margin-left: 40px">
                    <img style="width: 20%; height: 10%" src="../picture/footer02.PNG">
                </a>
            
                <a href="http://zsb.fzu.edu.cn/" target="view_window" style="margin-left: 40px">
                    <img style="width: 20%; height: 10%" src="../picture/footer03.PNG">
                </a>
            
                <a href="http://yjsy.fzu.edu.cn/" target="view_window" style="margin-left: 40px">
                    <img style="width: 20%; height: 10%" src="../picture/footer04.PNG">
                </a>
            
        </div>
    </div>
</div>


    


<div class="fd-f-bottom">
    <div class="container">
        <div class="fd-fb-logo">
            <img src="../picture/footer05.PNG">
        </div>
        <div class="fd-fb-public">
          <span class="fd-fbp-span1">
              学院地址：福州市闽侯县学园路2号福州大学数学与计算机科学学院
          </span>
          <span class="fd-fbp-span2">
              版权声明：© 2019
              福州大学软件学院19春季软工实践G013. 版权所有. 保留所有权利
          </span>
        </div>
    </div>
</div>

</div>
</body>
<script></script>
<script src="/website/static/fzsjgw/js/homepage.js"></script>
<script>
    var homeList = "/website/f/api/article/homeList";
    var ctxf = "/website/f";
    $('li.dropdown').mouseover(function () {
        $(this).addClass('open');
    }).mouseout(function () {
        $(this).removeClass('open');
    });
    $(document).ready(function () {
        
        homepages();
    });
</script>
             
   <!-- end Footer Area
    ========================================== -->
    
    <!-- 
    Essential Scripts
    =====================================-->
    
  <!-- Main jQuery -->
    <script src="../plugins/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap 3.1 -->
    <script src="../plugins/bootstrap/js/bootstrap.min.js"></script>
    <!-- Parallax -->
    <script src="../plugins/parallax/jquery.parallax-1.1.3.js"></script>
    <!-- lightbox -->
    <script src="../plugins/lightbox2/dist/js/lightbox.min.js"></script>
    <!-- slick Carousel -->
    <script src="../plugins/slick-carousel/slick/slick.min.js"></script>
    <!-- Portfolio Filtering -->
    <script src="../plugins/mixitup/dist/mixitup.min.js"></script>
    <!-- Smooth Scroll js -->
    <script src="../plugins/smooth-scroll/dist/js/smooth-scroll.min.js"></script>
    <script type="text/javascript" src="../plugins/revo-slider/js/jquery.themepunch.tools.min.js"></script>
    <script type="text/javascript" src="../plugins/revo-slider/js/jquery.themepunch.revolution.min.js"></script>
    <!-- Custom js -->
    <script src="../js/script.js"></script>

      <!-- SLIDER REVOLUTION 5.0 EXTENSIONS  
    (Load Extensions only on Local File Systems ! 
    The following part can be removed on Server for On Demand Loading) --> 
    <script type="text/javascript" src="../plugins/revo-slider/js/extensions/revolution.extension.actions.min.js"></script> 
    <script type="text/javascript" src="../plugins/revo-slider/js/extensions/revolution.extension.carousel.min.js"></script> 
    <script type="text/javascript" src="../plugins/revo-slider/js/extensions/revolution.extension.kenburn.min.js"></script> 
    <script type="text/javascript" src="../plugins/revo-slider/js/extensions/revolution.extension.layeranimation.min.js"></script> 
    <script type="text/javascript" src="../plugins/revo-slider/js/extensions/revolution.extension.migration.min.js"></script> 
    <script type="text/javascript" src="../plugins/revo-slider/js/extensions/revolution.extension.navigation.min.js"></script> 
    <script type="text/javascript" src="../plugins/revo-slider/js/extensions/revolution.extension.parallax.min.js"></script> 
    <script type="text/javascript" src="../plugins/revo-slider/js/extensions/revolution.extension.slideanims.min.js"></script> 
    <script type="text/javascript" src="../plugins/revo-slider/js/extensions/revolution.extension.video.min.js"></script> 
   
<script>
  
    /* https://learn.jquery.com/using-jquery-core/document-ready/ */
    jQuery(document).ready(function() {
 
        /* initialize the slider based on the Slider's ID attribute */
        jQuery('#rev_slider_1').show().revolution({
 
            /* options are 'auto', 'fullwidth' or 'fullscreen' */
            sliderLayout: 'fullscreen',
 
            /* basic navigation arrows and bullets */
            navigation: {
 
                arrows: {
                    style:"zeus",
                    enable:true,
                    hide_onmobile:true,
                    hide_under:600,
                    hide_onleave:true,
                    hide_delay:200,
                    hide_delay_mobile:1200,
                    tmp:'<div class="tp-title-wrap">    <div class="tp-arr-imgholder"></div> </div>',
                    left: {
                      h_align:"left",
                      v_align:"center",
                      h_offset:30,
                      v_offset:0
                    },
                    right: {
                      h_align:"right",
                      v_align:"center",
                      h_offset:30,
                      v_offset:0
                    }
                  }
                  ,
                  bullets: {
                    enable:false,
                    hide_onmobile:true,
                    hide_under:600,
                    style:"metis",
                    hide_onleave:true,
                    hide_delay:200,
                    hide_delay_mobile:1200,
                    direction:"horizontal",
                    h_align:"center",
                    v_align:"bottom",
                    h_offset:0,
                    v_offset:30,
                    space:5,
                    tmp:'<span class="tp-bullet-img-wrap">  <span class="tp-bullet-image"></span></span><span class="tp-bullet-title">{{title}}</span>'
                  }
            }
        });
    });
</script>          		

</body>
</html>