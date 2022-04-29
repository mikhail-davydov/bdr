import {Component} from "react";

import "./Payment.css";

export class Payment extends Component {

    render() {
        return (
            <div className="payment-container">
                <form action="/some-link-here" className="payment-form">
                    <input type="text" className="payment-form__comment" defaultValue="Комментарий"/>
                    <select name="form-select" id="form-select" className="payment-form__select-category">
                        <option value="" className="payment-form__select-option" selected disabled>Выбрать категорию
                        </option>
                        <option value="1" className="payment-form__select-option">ООО Ромашка</option>
                        <option value="2" className="payment-form__select-option">Компания 1</option>
                    </select>
                    <input type="date" className="payment-form__date"/>
                    <input type="number" className="payment-form__amount"/>
                    <div>
                        <label>
                            <input type="radio" className="payment-form__sign" name="sign" value="+" checked/>
                            +
                        </label>
                        <label>
                            <input type="radio" className="payment-form__sign" name="sign" value="-"/>
                            -
                        </label>
                    </div>
                    <button className="payment-form__submit">Создать</button>
                </form>
            </div>
        );
    }

}