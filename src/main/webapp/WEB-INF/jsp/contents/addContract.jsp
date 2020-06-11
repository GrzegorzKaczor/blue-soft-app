<section class="container">
    <form class="mt-4 mx-auto text-center needs-validation" style="width: 50%">
        <p class="mt-4 mb-4 mb-1 h5">System</p>
        <div class="form-group">
            <div class="mb-3">
                <label for="input-system-name">Nazwa</label>
                <input type="text" class="form-control" id="input-system-name" required>
            </div>
            <div class="mb-3">
                <label for="input-system-description">Opis sytemu</label>
                <textarea class="form-control" id="input-system-description" required></textarea>
            </div>
            <div class="mb-3">
                <label for="input-system-technologies">Technologie</label>
                <input type="text" class="form-control" id="input-system-technologies" required>
            </div>
            <div class="mb-3">
                <label for="input-system-owner">Klient</label>
                <input type="text" class="form-control" id="input-system-owner" required>
            </div>
        </div>

        <div class="form-group">
            <label class="h5 mb-4" for="input-order-number">Numer umowy</label>
            <input type="text" class="form-control" id="input-order-number">
        </div>

        <p class="mt-4 mb-4 h5">Umowa od</p>
        <div class="form-row align-items-center">
            <div class="col-4 mb-3">
                <label for="input-year-from-date">Rok</label>
                <input type="number" class="form-control" id="input-year-from-date" placeholder="rrrr" required>
            </div>
            <div class="col-4 mb-3">
                <label for="input-mont-from-date">Miesiąc</label>
                <input type="number" class="form-control" id="input-mont-from-date" placeholder="mm" required>
            </div>
            <div class="col-4">
                <label for="input-day-from-date">Dzień</label>
                <input type="number" class="form-control" id="input-day-from-date" placeholder="dd" required>
            </div>
        </div>
        <p class="mt-4 mb-4 h5">Umowa do</p>
        <div class="form-row align-items-center">
            <div class="col-4 mb-3">
                <label for="input-year-to-date">Rok</label>
                <input type="number" class="form-control" id="input-year-to-date" placeholder="rrrr" required>
            </div>
            <div class="col-4 mb-3">
                <label for="input-mont-to-date">Miesiąc</label>
                <input type="number" class="form-control" id="input-mont-to-date" placeholder="mm" required>
            </div>
            <div class="col-4 mb-3">
                <label for="input-day-to-date">Dzień</label>
                <input type="number" class="form-control" id="input-day-to-date" placeholder="dd" required>
            </div>
        </div>
        <p class="mt-4 mb-4 h5">Kwota umowy</p>
        <div class="form-row align-items-center">
            <div class="col-6 mt-0 mb-3">
                <label for="input-amount-pln">Złotych</label>
                <input type="number" class="form-control" id="input-amount-pln" required>
            </div>
            <div class="col-6 mb-3">
                <label for="input-amount-gr">Groszy</label>
                <input type="number" class="form-control" id="input-amount-gr" required>
            </div>
        </div>
        <p class="mt-4 mb-4 h5">Rodzaj umowy</p>
        <div class="form-row align-items-center mt-3">
            <div class="col-4 mb-3">
                <label for="input-amount-type">Typ</label>
                <select class="custom-select my-1 mr-sm-2" id="input-amount-type" required>
                    <option selected>...</option>
                    <option value="1">netto</option>
                    <option value="2">brutto</option>
                </select>
            </div>
            <div class="col-4 mb-3">
                <label for="input-amount-period">W skali</label>
                <select class="custom-select my-1 mr-sm-2 form-control" id="input-amount-period" required>
                    <option selected>...</option>
                    <option value="1">miesiąc</option>
                    <option value="2">rok</option>
                </select>
            </div>
            <div class="col-4 mb-3">
                <label for="input-active">Aktywna</label>
                <select class="custom-select my-1 mr-sm-2 form-control" id="input-active" required>
                    <option selected>...</option>
                    <option value="1">tak</option>
                    <option value="2">nie</option>
                </select>
            </div>
        </div>
        <button type="button" class="btn btn-secondary mt-5 col-12 text-light mb-5" id="add-contract-button">
            Zatwierdź
        </button>
    </form>
</section>