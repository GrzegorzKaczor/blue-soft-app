$(document).ready(function () {
    $('#example').DataTable({
        "paging": false,
        "ordering": false,
        "info": false
    });
});

$(document).ready(function () {
    $.getJSON('http://localhost:8080/contract/system', function (data) {
        data.forEach(function (dt) {
                ;

                $("#tablebody").append(
                    "<tr>" +
                    "<td class='text-center'>" + dt + "</td>" +
                    "</tr>"
                );
            }
        );
    });
});




