import {Component} from "react";

import "./PaymentFormSubmit.css";

export class PaymentFormSubmit extends Component {

    render() {
        let buttonText = "Добавить";
        return (
            <button className="button payment-form__submit"
                    type="submit">
                {buttonText}
            </button>
        );
    }

}