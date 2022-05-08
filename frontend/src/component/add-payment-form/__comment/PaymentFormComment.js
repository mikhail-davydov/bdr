import {Component} from "react";

import "./PaymentFormComment.css";

export class PaymentFormComment extends Component {

    render() {
        return (
            <input className="payment-form__comment"
                   name={"comment"}
                   type="text"
                   placeholder={"Комментарий"}
            />
        );
    }

}