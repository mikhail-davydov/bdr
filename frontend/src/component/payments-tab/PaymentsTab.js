import {Component} from "react";
import {AddPaymentForm} from "../add-payment-form/AddPaymentForm";

import "./PaymentsTab.css";

export class PaymentsTab extends Component {

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