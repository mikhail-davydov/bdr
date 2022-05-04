import {Component} from "react";

import "./PaymentFormAmount.css";

export class PaymentFormAmount extends Component {

    render() {
        return (
            <input className="payment-form__amount" name={"amount"} type="number" step={"0.01"}/>
        );
    }

}