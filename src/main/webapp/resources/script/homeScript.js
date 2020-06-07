$(document).ready(function () {
    $('#example').DataTable({
        "paging": false,
        "ordering": false,
        "info": false
    });
});

$(document).ready(function () {
    $.getJSON('http://localhost:8080/contract/all', function (data) {
        data.forEach(function (dt) {
                const fromDate = dt.fromDate.year + "-" + dt.fromDate.month + "- " + dt.fromDate.day;
                const toDate = dt.toDate.year + "-" + dt.toDate.month + "-" + dt.toDate.day;

                var valueMapAmountType;
                if (dt.amountType === "NET") {
                    valueMapAmountType = "netto";
                } else {
                    valueMapAmountType = "brutto";
                }
                ;
                const amount = dt.amount / 100 + " " + valueMapAmountType;

                var valueMapAvtivePeriod;
                if (dt.amountPeriod === "MONTH") {
                    valueMapAvtivePeriod = "na miesiąc";
                } else {
                    valueMapAvtivePeriod = "na rok";
                }
                ;
                const amountPeriod = valueMapAvtivePeriod;

                var activeMapValue;
                if (dt.active === true) {
                    activeMapValue = "TAK";
                } else {
                    activeMapValue = "NIE";
                }
                ;
                const active = activeMapValue;

                $("#tablebody").append(
                    "<tr>" +
                    "<td>" + dt.orderNumber + "</td>" +
                    "<td>" + dt.system + "</td>" +
                    "<td>" + fromDate + "</td>" +
                    "<td>" + toDate + "</td>" +
                    "<td>" + amount + "</td>" +
                    "<td>" + amountPeriod + "</td>" +
                    "<td>" + active + "</td>" +
                    "</tr>"
                );
            }
        );
    });
});




