import {Component} from "react";
import {PaymentForm} from "../payment-form/PaymentForm";

import "./Payment.css";

export class Payment extends Component {

    render() {
        return (
            <div className={"payment-container"}>
                <PaymentForm/>
                <div className="payment-content">
                    Here is the payment content
                </div>
            </div>
        );
    }

}