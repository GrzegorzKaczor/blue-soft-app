$(document).ready(function () {
    var table = $('#contract-tab').DataTable({
        info: false,
        pagingType: "simple_numbers",
    });
    $.getJSON('http://localhost:8080/contract/all', function (data) {
        data.forEach(function (dt) {
                const orderNumber = dt.orderNumber;
                const system = dt.system;

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

                var valueMapActivePeriod;

                if (dt.amountPeriod === "MONTH") {
                    valueMapActivePeriod = "na miesiąc";
                } else {
                    valueMapActivePeriod = "na rok";
                }
                ;
                const amountPeriod = valueMapActivePeriod;

                var activeMapValue;
                if (dt.active === true) {
                    activeMapValue = "TAK";
                } else {
                    activeMapValue = "NIE";
                }
                ;
                const active = activeMapValue;

                data = [orderNumber, system, fromDate, toDate, amount, amountPeriod, active];
                table.row.add(data).draw();
            }
        );
    });
    table.rows.add(dataTab).draw();
});


// var data = [
//     [
//         "Tiger Nixon",
//         "System Architect",
//         "Edinburgh",
//         "5421",
//         "2011/04/25",
//         "$3,120",
//         "TAK"
//     ],[
//         "Tiger Nixon",
//         "System Architect",
//         "Edinburgh",
//         "5421",
//         "2011/04/25",
//         "$3,120",
//         "TAK"
//     ],[
//         "Tiger Nixon",
//         "System Architect",
//         "Edinburgh",
//         "5421",
//         "2011/04/25",
//         "$3,120",
//         "TAK"
//     ],[
//         "Tiger Nixon",
//         "System Architect",
//         "Edinburgh",
//         "5421",
//         "2011/04/25",
//         "$3,120",
//         "TAK"
//     ],[
//         "Tiger Nixon",
//         "System Architect",
//         "Edinburgh",
//         "5421",
//         "2011/04/25",
//         "$3,120",
//         "TAK"
//     ],[
//         "Tiger Nixon",
//         "System Architect",
//         "Edinburgh",
//         "5421",
//         "2011/04/25",
//         "$3,120",
//         "TAK"
//     ],[
//         "Tiger Nixon",
//         "System Architect",
//         "Edinburgh",
//         "5421",
//         "2011/04/25",
//         "$3,120",
//         "TAK"
//     ],
//     [
//         "Garrett Winters",
//         "Director",
//         "Edinburgh",
//         "8422",
//         "2011/07/25",
//         "$5,300",
//         "TAK"
//     ]
// ]
// console.log(data);
// $('#example').DataTable({
//     data: data
//
// });

// $(document).ready(function () {
//     $.getJSON('http://localhost:8080/contract/all', function (data) {
//         $('#example').DataTable({
//             data: data,
//             colummns: [
//                 {
//                     'data': 'Numer umowy',
//                     'render': function (data) {
//                         return data.orderNumber;
//                     }
//                 },
//                 {
//                     'data': 'System',
//                     'render': function (data) {
//                         return data.system;
//                     }
//                 },
//                 {
//                     'data': 'Od',
//                     'render': function (data) {
//                         return data.fromDate.year + "-" + data.fromDate.month + "- " + data.fromDate.day;
//                     }
//                 },
//                 {
//                     'data': 'Do',
//                     'render': function (data) {
//                         return data.toDate.year + "-" + data.toDate.month + "-" + data.toDate.day;
//                     }
//                 }, {
//                     'data': 'Kwota',
//                     'render': function (data) {
//                         if (data.amountType === "NET") {
//                             var valueMapAmountType = "netto";
//                         } else {
//                             valueMapAmountType = "brutto";
//                         }
//                         ;
//                         return data.amount / 100 + " " + valueMapAmountType;
//                     }
//                 },
//                 {
//                     'data': 'W skali',
//                     'render': function (data) {
//                         if (data.active === true) {
//                             var activeMapValue = "TAK";
//                         } else {
//                             activeMapValue = "NIE";
//                         }
//                         ;
//                         return activeMapValue;
//                     }
//                 },
//                 {
//                     'data': "Aktywna",
//                     'render': function (data) {
//                         if (data.active === true) {
//                             var activeMapValue = "TAK";
//                         } else {
//                             activeMapValue = "NIE";
//                         }
//                         ;
//                         return activeMapValue;
//                     }
//                 }
//             ],
//         });
//     });
// });
//
//

