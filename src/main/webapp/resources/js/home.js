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
