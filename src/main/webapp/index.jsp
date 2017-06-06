<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>Home</title>
		<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
		<link href="css/style.css" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" type="text/css" href="css/ionicons.css" />

		<script src="js/jquery.min.js"></script>
	</head>

	<body>
		<div class="header">
			<div class="header-top">
				<div class="wrap">
					<div class="top-menu">
						<ul>
							<li>
								<a href="index.jsp">首页</a>
							</li>
							<li>
								<a href="about.html">关于我们</a>
							</li>
							<li>
								<a href="contact.html">联系我们</a>
							</li>
						</ul>
					</div>
					<div class="top-menu pull-right">
						<ul>
							<li>
								<a data-toggle="modal" data-target="#loginModal">登录</a>
							</li>
							<li>
								<a href="signup.html">注册</a>
							</li>
						</ul>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>

			<!--登录模态框-->

			<div id="login">

			</div>

			<!--logo和导航栏-->
			<div class="header-bottom">
				<div class="logo text-center">
					<a href="homePage.html">
						<img src="img/bk1.png" alt="" />
					</a>
				</div>
				<div class="navigation">
					<nav class="navbar navbar-default" role="navigation">
						<div class="wrap">
							<div class="navbar-header">
								<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#home-navbar-collapse">
									<span class="sr-only">Toggle navigation</span>
									
								</button>
							</div>
							<div class="collapse navbar-collapse" id="home-navbar-collapse">
								<ul class="nav navbar-nav">
									<li class="active">

										<a href="index.html">
											<i class="icon ion-android-home"></i> Home
										</a>
									</li>
									<li>
										<a href="#">java</a>
									</li>
									<li>
										<a href="#">Vue
										</a>

									</li>
									<li>
										<a href="#">JavaScript</a>
									</li>
									<li>
										<a href="#">HTML5</a>
									</li>
									<li>
										<a href="#">CSS3</a>
									</li>
									<li>
										<a href="#">git</a>
									</li>
									<div class="clearfix"></div>
								</ul>
							</div>
						</div>
				</div>
				</nav>
			</div>
		</div>
		<!-- content-section-starts-here -->
		<div class="main-body">
			<div class="wrap">
				<div class="col-md-8 content-left">
					<div class="slider">
						<div class="callbacks_wrap">
							<ul class="rslides" id="slider">

								<li>
									<img src="img/lb4.jpg" alt="">
									<div class="caption">
										<a href="#">科技博文</a>
									</div>
								</li>
								<li>
									<img src="img/lb3.jpg" alt="">
									<div class="caption">
										<a href="#">科技博文</a>
									</div>
								</li>
								<li>
									<img src="img/lb2.jpg" alt="">
									<div class="caption">
										<a href="#">科技博文</a>
									</div>
								</li>
								<li>
									<img src="img/lb5.jpg" alt="">
									<div class="caption">
										<a href="#">科技博文</a>
									</div>
								</li>
							</ul>
						</div>
					</div>
					<div class="articles">
						<div class="col-md-12 text-center pageTitle">
							<h3><span>热门文章</span></h3>
						</div>
						<div class="article">
							<div class="article-left">
								<a href="#"><img src="images/article3.jpg"></a>
							</div>
							<div class="article-right">
								<div class="article-title">
									<p>On Jun 21, 2015
										<a class="span_link" href="#"><span class="glyphicon glyphicon-comment"></span>0 </a>
										<a class="span_link" href="#"><span class="glyphicon glyphicon-eye-open"></span>181 </a>
										<a class="span_link" href="#"><span class="glyphicon glyphicon-thumbs-up"></span>89</a>
									</p>
									<a class="title" href="#">Java-世界上最好的语言</a>
								</div>
								<div class="article-text">
									<p>Java-世界上最好的语言<br />PHP：来啊！打一架！PHP才是世界上最好的语言！</p>
									<div class="clearfix"></div>
								</div>

							</div>
							<div class="clearfix"></div>
						</div>
					</div>
					<div class="article">
						<div class="article-left">
							<a href="#"><img src="images/article1.jpg"></a>
						</div>
						<div class="article-right">
							<div class="article-title">
								<p>2017-06-05
									<a class="span_link" href="#"><span class="glyphicon glyphicon-comment"></span>0 </a>
									<a class="span_link" href="#"><span class="glyphicon glyphicon-eye-open"></span>104 </a>
									<a class="span_link" href="#"><span class="glyphicon glyphicon-thumbs-up"></span>52</a>
								</p>
								<a class="title" href="#">标题</a>
							</div>
							<div class="article-text">
								<p>内容。。。。。。。</p>
								<div class="clearfix"></div>
							</div>
						</div>
						<div class="clearfix"></div>
					</div>

				</div>
				<div class="col-md-4 side-bar">
					<div class="first_half">
						<a href="#" class="featured text-center animate-box" style="background-image: url(img/z4.png);background-repeat: no-repeat;background-size: contain;background-position: center;">
							<div class="desc">
								<span class="date">May. 30th 2017</span>
								<h3>Author：Echo</h3>
								<span class="category">JavaScript</span>
							</div>
						</a>
						<a href="#" class="featured text-center animate-box" style="background-image: url(img/z5.jpg);background-repeat: no-repeat;background-size:contain;background-position: center;">
							<div class="desc">
								<span class="date">May. 30th 2017</span>
								<h3>Author：Echo</h3>
								<span class="category">JavaScript</span>
							</div>
						</a>
					</div>
					<div class="secound_half">
						<div class="tags">
							<div class="col-md-12 text-center pageTitle">
								<h3><span>标签</span></h3>
							</div>
							<p>
								<a class="tag2" href="#">PHP</a>
								<a class="tag3" href="#">JavaScript</a>
								<a class="tag4" href="#">Vue.js</a>
								<a class="tag5" href="#">node.js</a>
								<a class="tag6" href="#">Angular</a>
								<a class="tag7" href="#">HTML5</a>
								<a class="tag8" href="#">CSS3</a>
								<a class="tag9" href="#">jQuery</a>
								<a class="tag1" href="#">JAVA</a>
								<a class="tag6" href="#">Angular</a>
								<a class="tag7" href="#">HTML5</a>
								<a class="tag8" href="#">CSS3</a>
								<a class="tag10" href="#">python</a>
								<a class="tag11" href="#">No.1</a>
								<a class="tag2" href="#">PHP</a>
								<a class="tag9" href="#">jQuery</a>
								<a class="tag10" href="#">python</a>
								<a class="tag3" href="#">JavaScript</a>
								<a class="tag4" href="#">Vue.js</a>
								<a class="tag5" href="#">node.js</a>
							</p>
						</div>

					</div>
					<div class="clearfix"></div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<!-- content-section-ends-here -->
		<!-- footer-section-starts-here -->
		<div class="footer-bottom text-center">
			<div class="wrap">
				<div class="col-md-12">
					<p>Copyright &copy; 2017-第1组项目实训
					</p>
				</div>
				<div class="footericons col-md-6 pull-right">
					<ul>
						<li>
							<a class="icon ion-social-twitter" href="#"></a>
						</li>
						<li>
							<a class="icon ion-social-github" href="#"></a>
						</li>
						<li>
							<a class="icon ion-social-facebook" href="#"></a>
						</li>
						<li>
							<a class="icon ion-social-google-outline" href="#"></a>
						</li>
					</ul>
				</div>
				<div class="clearfix"></div>
			</div>

		</div>
		<a href="#to-top" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
		<!---->

		<script type="text/javascript" src="js/bootstrap.js"></script>
		<script src="js/responsiveslides.min.js"></script>
		<script type="text/javascript" src="js/move-top.js"></script>
		<script type="text/javascript" src="js/easing.js"></script>
		<script src="js/main.js" type="text/javascript" charset="utf-8"></script>

	</body>

</html>
