$("#add-contract-button").click(function () {
    const orderNumber = $("#input-order-number").val();
    const system = $("#input-system").val();

    const yearFromDate = Number.valueOf($("#input-year-from-date").val());
    const monthFromDate = Number.valueOf($("#input-mont-from-date").val());
    const dayFromDate = Number.valueOf($("#input-day-from-date").val());
    const fromDate = {
        year: yearFromDate,
        month: monthFromDate,
        day: dayFromDate
    };

    const yearToDate = Number.valueOf($("#input-year-to-date").val());
    const monthToDate = Number.valueOf($("#input-mont-to-date").val());
    const dayToDate = Number.valueOf($("#input-day-to-date").val());
    const toDate = {
        year: yearToDate,
        month: monthToDate,
        day: dayToDate
    };

    const amount = $("#input-amount-pln").val() * 100 + $("#input-amount-gr").val();

    var amountType;
    if ($("#input-amount-type").val() === "netto") {
        amountType = "NET";
    } else {
        amountType = "BRU";
    }
    ;

    var amountPeriod;
    if ($("#input-amount-period").val() === "rok") {
        amountPeriod = "YEAR";
    } else {
        amountPeriod = "MONTH";
    }
    ;


    var active;
    if ($("#inputActive" === "TAK")) {
        active = true;
    } else {
        active = false;
    }
    ;

    const contractDto = {
        system: system,
        orderNumber: orderNumber,
        fromDate: fromDate,
        toDate: toDate,
        amount: amount,
        amountType: amountType,
        amountPeriod: amountPeriod,
        active: active
    };
    console.log(contractDto);

    console.log(JSON.stringify(contractDto));

    jQuery.support.cors = true;
    $.ajax({
        method: "post",
        url: "http://localhost:8080/contract",
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify(contractDto),
        success: function () {
            window.location.href = "http://localhost:8080/all";
        },
        error: function () {
            alert("Niepoprawne dane!");
        }
    });
});







