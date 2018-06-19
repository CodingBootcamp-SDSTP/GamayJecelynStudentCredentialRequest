window.onload = function() {
	var s = document.getElementById('sidebar');

	s.onclick = function() {
		var n = document.getElementById('box');
		if (n.style.display != "none") {
			n.style.display = "block";
		}
	}
}





