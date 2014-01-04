$(document).ready(function(){
    $("#clickArea").click(function() {
//                    $("#logo_img").fadeIn(1000);
        $("#logo").slideToggle("slow");
    });
});

function showMyName(name) {
    alert("Hello " + name);
}

function showHello() {
    var name = prompt("Type your name ", "");
    showMyName(name);
}