function show_menu(s) {
    document.getElementById(s).classList.toggle("show");
}

// Close the dropdown menu if the user clicks outside of it
window.onclick = function(event) {
    if (!event.target.matches('.dropdownlink')) {
        var dropdowns = document.getElementsByClassName("menuitems");
        var i;
        for (i = 0; i < dropdowns.length; i++) {
            var openDropdown = dropdowns[i];
            if (openDropdown.classList.contains('show')) {
                openDropdown.classList.remove('show');
            }
        }
    }
}

// Progress bar for registration form, increase each time a field is selected.
var counter=0;
function moveByX(x){
    var width =10;
    var bar = document.getElementById('bar');
    counter++;
    if(counter* x < 101){
        bar.style.width = counter *x +'%';
    }
}