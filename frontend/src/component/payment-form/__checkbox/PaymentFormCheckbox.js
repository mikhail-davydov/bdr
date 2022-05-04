import {Component} from "react";

import "./PaymentFormCheckbox.css";

export class PaymentFormCheckbox extends Component {

    render() {
        return (
            <label className="payment-form__checkbox-label">
                <span className="payment-form__checkbox-text">Расход</span>
                <div className="payment-form__checkbox-container">
                    <input className="payment-form__checkbox" type="checkbox" name="positive"/>
                </div>
                <span className="payment-form__checkbox-text">Приход</span>
            </label>
        );
    }

}