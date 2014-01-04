var isLogoOpened;

$(document).ready(function(){
    $("#clickArea").click(function() {
//                    $("#logo_img").fadeIn(1000);
        $("#logo").slideToggle("slow");

        changeClickText();
    });
});

function showMyName(name) {
    alert("Hello " + name);
}

function showHello() {
    var name = prompt("Type your name ", "");
    showMyName(name);
}

function changeClickText() {
    if(isLogoOpened == null) {
        $("#clickArea").text("Close Logo!");
        isLogoOpened = true;
    } else if(isLogoOpened === true) {
        $("#clickArea").text("Open Logo!");
        isLogoOpened = false;
    } else {
        $("#clickArea").text("Close Logo!");
        isLogoOpened = true;
    }
}