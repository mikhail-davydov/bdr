import {Component} from "react";

import "./PaymentFormListItem.css";

export class PaymentFormListItem extends Component {

    render() {
        return (
            <li className="payment-form__list-item">
                {this.props.itemContent}
            </li>
        );
    }

}