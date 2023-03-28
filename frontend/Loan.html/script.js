$(document).ready(function() {
	$('#employee-form').submit(function(event) {
		event.preventDefault();
		var form = $(this);
		var data = form.serialize();
		$.ajax({
			type: 'POST',
			url: 'submit-employee.php',
			data: data,
			success: function(response) {
				$('#response').html(response);
			},
			error: function() {
				alert('An error occurred while submitting the form.');
			}
		});
	});
});
``