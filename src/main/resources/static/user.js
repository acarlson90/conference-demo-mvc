$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/conference-demo-mvc-0.0.1-SNAPSHOT/users"
    }).then(function(data) {
        $('.firstname').append(data.firstName);
        $('.lastname').append(data.lastName);
        $('.age').append(data.age);
    })
});
