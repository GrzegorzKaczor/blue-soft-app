<section class="container">
    <form class="mt-4 mx-auto text-center" style="width: 50%">
        <div class="form-group">
            <label class="h5" for="input-order-number">Numer umowy</label>
            <input type="text" class="form-control" id="input-order-number">
        </div>
        <div class="form-group">
            <label class="h5" for="input-system">System</label>
            <input type="text" class="form-control" id="input-system">
        </div>
        <p class="mt-4 mb-1 h5">Umowa od</p>
        <div class="form-row align-items-center">
            <div class="col-4">
                <label for="input-year-from-date">Rok</label>
                <input type="number" class="form-control" id="input-year-from-date" placeholder="rrrr">
            </div>
            <div class="col-4">
                <label for="input-mont-from-date">Miesiąc</label>
                <input type="number" class="form-control" id="input-mont-from-date" placeholder="mm">
            </div>
            <div class="col-4">
                <label for="input-day-from-date">Dzień</label>
                <input type="number" class="form-control" id="input-day-from-date" placeholder="dd">
            </div>
        </div>
        <p class="mt-4 mb-1 h5">Umowa do</p>
        <div class="form-row align-items-center">
            <div class="col-4">
                <label for="input-year-to-date">Rok</label>
                <input type="number" class="form-control" id="input-year-to-date" placeholder="rrrr">
            </div>
            <div class="col-4">
                <label for="input-mont-to-date">Miesiąc</label>
                <input type="number" class="form-control" id="input-mont-to-date" placeholder="mm">
            </div>
            <div class="col-4">
                <label for="input-day-to-date">Dzień</label>
                <input type="number" class="form-control" id="input-day-to-date" placeholder="dd">
            </div>
        </div>
        <p class="mt-4 mb-1 h5">Kwota umowy</p>
        <div class="form-row align-items-center">
            <div class="col-6 mt-0">
                <label for="input-amount-pln">Złotych</label>
                <input type="number" class="form-control" id="input-amount-pln">
            </div>
            <div class="col-6">
                <label for="input-amount-gr">Groszy</label>
                <input type="number" class="form-control" id="input-amount-gr">
            </div>
        </div>
        <p class="mt-4 mb-1 h5">Rodzaj umowy</p>
        <div class="form-row align-items-center mt-3">
            <div class="col-4">
                <label for="input-amount-type">Typ</label>
                <select class="custom-select my-1 mr-sm-2" id="input-amount-type">
                    <option selected>...</option>
                    <option value="1">netto</option>
                    <option value="2">brutto</option>
                </select>
            </div>
            <div class="col-4">
                <label for="input-amount-period">W skali</label>
                <select class="custom-select my-1 mr-sm-2" id="input-amount-period">
                    <option selected>...</option>
                    <option value="1">miesiąc</option>
                    <option value="2">rok</option>
                </select>
            </div>
            <div class="col-4">
                <label for="input-active">Aktywna</label>
                <select class="custom-select my-1 mr-sm-2" id="input-active">
                    <option selected>...</option>
                    <option value="1">tak</option>
                    <option value="2">nie</option>
                </select>
            </div>
        </div>
        <button type="button" class="btn btn-secondary mt-5 col-12 text-light mb-5" id="add-contract-button">Zatwierdź</button>
    </form>
</section>