/**
 * 
 */

(function () {
	'use strict';

	var sideTabsPaneHeight = function() {
		var navHeight = $('.nav-tabs.nav-tabs-left').outerHeight() || $('.nav-tabs.nav-tabs-right').outerHeight() || 0;

		var paneHeight = 0;

		$('.tab-content.side-tabs .tab-pane').each(function(idx) {
			paneHeight = $(this).outerHeight() > paneHeight ? $(this).outerHeight() : paneHeight;
		});

		$('.tab-content.side-tabs .tab-pane').each(function(idx) {
			$(this).css('min-height', navHeight + 'px');
		});
	};
	
  $(function() {
    sideTabsPaneHeight();

		$( window ).resize(function() {
			sideTabsPaneHeight();
		});

		$( '.nav-tabs.nav-tabs-left' ).resize(function() {
			sideTabsPaneHeight();
		});
	});
}());



///* Demo Scripts for Making Twitter Bootstrap 3 Tab Play Nicely With The Masonry Library
//* on SitePoint by Maria Antonietta Perna
//*/
//
////Initialize Masonry inside Bootstrap 3 Tab component 
//
//(function( $ ) {
//
//	var $container = $('.masonry-container');
//	$container.imagesLoaded( function () {
//		$container.masonry({
//			columnWidth: '.item',
//			itemSelector: '.item'
//		});
//	});
//	
//	//Reinitialize masonry inside each panel after the relative tab link is clicked - 
//	$('a[data-toggle=tab]').each(function () {
//		var $this = $(this);
//
//		$this.on('shown.bs.tab', function () {
//		
//			$container.imagesLoaded( function () {
//				$container.masonry({
//					columnWidth: '.item',
//					itemSelector: '.item'
//				});
//			});
//
//		}); //end shown
//	});  //end each
//	
//})(jQuery);
