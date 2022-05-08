import {Component} from "react";
import {AddPaymentForm} from "../add-payment-form/AddPaymentForm";

import "./Payment.css";

export class Payment extends Component {

    render() {
        return (
            <div className={"payment-container"}>
                <AddPaymentForm/>
                <div className="payment-content">
                    Here is the Payment tab content
                </div>
            </div>
        );
    }

}