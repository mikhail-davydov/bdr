import {Component} from "react";
import {AddPaymentForm} from "../payment-form/AddPaymentForm";

import "./Payment.css";

export class Payment extends Component {

    render() {
        return (
            <div className={"payment-container"}>
                <AddPaymentForm/>
                <div className="payment-content">
                    Here is the payment content
                </div>
            </div>
        );
    }

}