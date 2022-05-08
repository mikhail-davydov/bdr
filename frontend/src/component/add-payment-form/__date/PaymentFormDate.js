import {Component} from "react";

import "./PaymentFormDate.css";

export class PaymentFormDate extends Component {

    render() {
        let today = new Date().toLocaleDateString("en-CA");
        return (
            <input
                className="payment-form__date"
                name={"date"}
                type="date"
                defaultValue={today}
            />
        );
    }

}