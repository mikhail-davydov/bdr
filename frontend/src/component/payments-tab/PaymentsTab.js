import {Component} from "react";
import {AddPaymentForm} from "../add-payment-form/AddPaymentForm";
import {PaymentsContent} from "../payments-content/PaymentsContent";

import "./PaymentsTab.css";

export class PaymentsTab extends Component {

    render() {
        return (
            <div className={"payment-container"}>
                <AddPaymentForm/>
                <PaymentsContent/>
            </div>
        );
    }

}