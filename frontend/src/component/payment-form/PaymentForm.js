import {Component} from "react";
import {PaymentFormList} from "./__list/PaymentFormList";

import "./PaymentForm.css";

export class PaymentForm extends Component {

    constructor(props) {
        super(props);
        this.onSubmit = this.onSubmit.bind(this);
    }

    render() {
        return (
            <div>
                <form className="payment-form" onSubmit={this.onSubmit}>
                    <PaymentFormList/>
                </form>
            </div>
        );
    }

    onSubmit(e) {
        e.preventDefault();
        // todo: handle form submit, add payment to list
        console.log("Click on submit form button");
    }

}