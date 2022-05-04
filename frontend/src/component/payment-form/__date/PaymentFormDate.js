import {Component} from "react";

import "./PaymentFormDate.css";

export class PaymentFormDate extends Component {

    render() {
        return (
            <input className="payment-form__date" name={"date"} type="date"/>
        );
    }

}