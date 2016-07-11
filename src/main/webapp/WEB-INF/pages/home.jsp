<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<link type="text/css" href="/IMS/resources/css/home.css" rel="stylesheet">

</head>
<body>
<%@ include file="navbar.jsp" %>

<div class="container main-container">

  <div role="tabpanel">

    <!-- Nav tabs -->
    <ul class="nav nav-tabs" role="tablist">
      <li role="presentation" class="active"><a href="#panel-1" aria-controls="panel-1" role="tab" data-toggle="tab">CPU</a></li>
      <li role="presentation"><a href="#panel-2" aria-controls="panel-2" role="tab" data-toggle="tab">GPU</a></li>
      <li role="presentation"><a href="#panel-3" aria-controls="panel-3" role="tab" data-toggle="tab">Motherboard</a></li>
      <li role="presentation"><a href="#panel-4" aria-controls="panel-4" role="tab" data-toggle="tab">Hard Drive</a></li>
      <li role="presentation"><a href="#panel-4" aria-controls="panel-4" role="tab" data-toggle="tab">SSD</a></li>
      <li role="presentation"><a href="#panel-4" aria-controls="panel-4" role="tab" data-toggle="tab">RAM</a></li>
      <li role="presentation"><a href="#panel-4" aria-controls="panel-4" role="tab" data-toggle="tab">Power Supply</a></li>
      <li role="presentation"><a href="#panel-4" aria-controls="panel-4" role="tab" data-toggle="tab">Mouse</a></li>
      <li role="presentation"><a href="#panel-4" aria-controls="panel-4" role="tab" data-toggle="tab">Keyboard</a></li>
      <li role="presentation"><a href="#panel-4" aria-controls="panel-4" role="tab" data-toggle="tab">Monitor</a></li>
    </ul>

    <!-- Tab panes -->
    <div class="tab-content">

      <div role="tabpanel" class="tab-pane active" id="panel-1">
        <div class="row masonry-container">

		<c:forEach items="${ prodCatList }" var="prodCat">
          <div class="col-md-4 col-sm-6 item">
            <div class="thumbnail">
              <img src="/IMS/resources/images/${ prodCat.product.productImage }" alt="">
              <div class="caption">
                <h3>${ prodCat.product.productName }</h3>
                <p>${ prodCat.product.productDescription }</p>
                <p><a href="#" class="btn btn-primary" role="button">Order</a> <a href="#" class="btn btn-default" role="button">
                <fmt:setLocale value="en_US"/><fmt:formatNumber value="${ prodCat.product.unitCost }" type="currency"/></a>
                Quanity<select>
				  <option value="pack1">${ prodCat.product.reorderQuantity * 1}</option>
				  <option value="pack2">${ prodCat.product.reorderQuantity * 2}</option>
				  <option value="pack3">${ prodCat.product.reorderQuantity * 3}</option>
				  <option value="pack4">${ prodCat.product.reorderQuantity * 4}</option>
				</select></p>
              </div>
            </div>
          </div><!--/.item  --> 
        </c:forEach> 
         
        </div> <!--/.masonry-container  -->
      </div><!--/.tab-panel -->

      <div role="tabpanel" class="tab-pane" id="panel-2">

        <div class="row masonry-container">

          <div class="col-md-4 col-sm-6 item">
            <div class="thumbnail">
              <img src="http://lorempixel.com/200/200/city" alt="">
              <div class="caption">
                <h3>Thumbnail label</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. </p>
                <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
              </div>
            </div>
          </div><!--/.item  -->

          <div class="col-md-4 col-sm-6 item">
            <div class="thumbnail">
              <div class="caption">
                <h3>Thumbnail label</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corrupti, illum voluptates consectetur consequatur ducimus. Necessitatibus, nobis consequatur hic eaque laborum laudantium. Adipisci, explicabo, asperiores molestias deleniti unde dolore enim quas.</p>
                <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
              </div>
            </div>
          </div><!--/.item  -->

          <div class="col-md-4 col-sm-6 item">
            <div class="thumbnail">
              <img src="http://lorempixel.com/200/200/city" alt="">
              <div class="caption">
                <h3>Thumbnail label</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corrupti, illum voluptates consectetur consequatur ducimus. Necessitatibus, nobis consequatur hic eaque laborum laudantium. Adipisci, explicabo, asperiores molestias deleniti unde dolore enim quas.</p>
                <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
              </div>
            </div>
          </div><!--/.item  -->

          <div class="col-md-4 col-sm-6 item">
            <div class="thumbnail">
              <img src="http://lorempixel.com/200/200/city" alt="">
              <div class="caption">
                <h3>Thumbnail label</h3>
                <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
              </div>
            </div>
          </div><!--/.item  -->

          <div class="col-md-4 col-sm-6 item">
            <div class="thumbnail">
              <img src="http://lorempixel.com/200/200/city" alt="">
              <div class="caption">
                <h3>Thumbnail label</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corrupti, illum voluptates consectetur consequatur ducimus. Necessitatibus, nobis consequatur hic eaque laborum laudantium. Adipisci, explicabo, asperiores molestias deleniti unde dolore enim quas.</p>
                <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
              </div>
            </div>
          </div><!--/.item  -->

          <div class="col-md-4 col-sm-6 item">
            <div class="thumbnail">
              <img src="http://lorempixel.com/200/200/city" alt="">
              <div class="caption">
                <h3>Thumbnail label</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corrupti, illum voluptates consectetur consequatur ducimus. Necessitatibus, nobis consequatur hic eaque laborum laudantium. Adipisci, explicabo, asperiores molestias deleniti unde dolore enim quas.</p>
                <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
              </div>
            </div>
          </div>

        </div> <!--/.masonry-container  -->

      </div><!--/.tab-panel -->

      <div role="tabpanel" class="tab-pane" id="panel-3">
        <div class="row masonry-container">

          <div class="col-md-4 col-sm-6 item">
            <div class="thumbnail">
              <img src="http://lorempixel.com/200/200/nature" alt="">
              <div class="caption">
                <h3>Thumbnail label</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. </p>
                <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
              </div>
            </div>
          </div><!--/.item  -->

          <div class="col-md-4 col-sm-6 item">
            <div class="thumbnail">
              <div class="caption">
                <h3>Thumbnail label</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corrupti, illum voluptates consectetur consequatur ducimus. Necessitatibus, nobis consequatur hic eaque laborum laudantium. Adipisci, explicabo, asperiores molestias deleniti unde dolore enim quas.</p>
                <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
              </div>
            </div>
          </div><!--/.item  -->

          <div class="col-md-4 col-sm-6 item">
            <div class="thumbnail">
              <img src="http://lorempixel.com/200/200/nature" alt="">
              <div class="caption">
                <h3>Thumbnail label</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corrupti, illum voluptates consectetur consequatur ducimus. Necessitatibus, nobis consequatur hic eaque laborum laudantium. Adipisci, explicabo, asperiores molestias deleniti unde dolore enim quas.</p>
                <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
              </div>
            </div>
          </div><!--/.item  -->

          <div class="col-md-4 col-sm-6 item">
            <div class="thumbnail">
              <img src="http://lorempixel.com/200/200/nature" alt="">
              <div class="caption">
                <h3>Thumbnail label</h3>
                <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
              </div>
            </div>
          </div><!--/.item  -->

          <div class="col-md-4 col-sm-6 item">
            <div class="thumbnail">
              <img src="http://lorempixel.com/200/200/nature" alt="">
              <div class="caption">
                <h3>Thumbnail label</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corrupti, illum voluptates consectetur consequatur ducimus. Necessitatibus, nobis consequatur hic eaque laborum laudantium. Adipisci, explicabo, asperiores molestias deleniti unde dolore enim quas.</p>
                <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
              </div>
            </div>
          </div><!--/.item  -->

          <div class="col-md-4 col-sm-6 item">
            <div class="thumbnail">
              <img src="http://lorempixel.com/200/200/nature" alt="">
              <div class="caption">
                <h3>Thumbnail label</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corrupti, illum voluptates consectetur consequatur ducimus. Necessitatibus, nobis consequatur hic eaque laborum laudantium. Adipisci, explicabo, asperiores molestias deleniti unde dolore enim quas.</p>
                <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
              </div>
            </div>
          </div>

        </div> <!--/.masonry-container  -->
      </div><!--/.tab-panel -->

      <div role="tabpanel" class="tab-pane" id="panel-4">
        <div class="row masonry-container">

          <div class="col-md-4 col-sm-6 item">
            <div class="thumbnail">
              <img src="http://lorempixel.com/200/200/cats" alt="">
              <div class="caption">
                <h3>Thumbnail label</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. </p>
                <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
              </div>
            </div>
          </div><!--/.item  -->

          <div class="col-md-4 col-sm-6 item">
            <div class="thumbnail">
              <div class="caption">
                <h3>Thumbnail label</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corrupti, illum voluptates consectetur consequatur ducimus. Necessitatibus, nobis consequatur hic eaque laborum laudantium. Adipisci, explicabo, asperiores molestias deleniti unde dolore enim quas.</p>
                <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
              </div>
            </div>
          </div><!--/.item  -->

          <div class="col-md-4 col-sm-6 item">
            <div class="thumbnail">
              <img src="http://lorempixel.com/200/200/cats" alt="">
              <div class="caption">
                <h3>Thumbnail label</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corrupti, illum voluptates consectetur consequatur ducimus. Necessitatibus, nobis consequatur hic eaque laborum laudantium. Adipisci, explicabo, asperiores molestias deleniti unde dolore enim quas.</p>
                <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
              </div>
            </div>
          </div><!--/.item  -->

          <div class="col-md-4 col-sm-6 item">
            <div class="thumbnail">
              <img src="http://lorempixel.com/200/200/cats" alt="">
              <div class="caption">
                <h3>Thumbnail label</h3>
                <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
              </div>
            </div>
          </div><!--/.item  -->

          <div class="col-md-4 col-sm-6 item">
            <div class="thumbnail">
              <img src="http://lorempixel.com/200/200/cats" alt="">
              <div class="caption">
                <h3>Thumbnail label</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corrupti, illum voluptates consectetur consequatur ducimus. Necessitatibus, nobis consequatur hic eaque laborum laudantium. Adipisci, explicabo, asperiores molestias deleniti unde dolore enim quas.</p>
                <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
              </div>
            </div>
          </div><!--/.item  -->

          <div class="col-md-4 col-sm-6 item">
            <div class="thumbnail">
              <img src="http://lorempixel.com/200/200/cats" alt="">
              <div class="caption">
                <h3>Thumbnail label</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corrupti, illum voluptates consectetur consequatur ducimus. Necessitatibus, nobis consequatur hic eaque laborum laudantium. Adipisci, explicabo, asperiores molestias deleniti unde dolore enim quas.</p>
                <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
              </div>
            </div>
          </div>

        </div> <!--/.masonry-container  -->
      </div><!--/.tab-panel -->

    </div> <!--/.tab-content -->

  </div> <!--/.tab-panel  -->

</div><!-- /.container -->


</body>

<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script   src="https://code.jquery.com/jquery-3.1.0.min.js"   integrity="sha256-cCueBR6CsyA4/9szpPfrX3s49M9vUU5BgtiJj06wt/s="   crossorigin="anonymous"></script>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/IMS/resources/js/home.js"></script>
	<script src="https://npmcdn.com/masonry-layout@4.0/dist/masonry.pkgd.min.js"></script>
	
</html>

