import {Component} from "react";

import "./PaymentFormSelectOption.css";

export class PaymentFormSelectOption extends Component {

    render() {
        return (
            <option value={this.props.selectOptionId}
                    className="payment-form__select-option"
                    disabled={this.props.selectOptionDisabled}>
                {this.props.selectOptionText}
            </option>
        );
    }

}