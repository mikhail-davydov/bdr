import {Component} from "react";
import {PaymentFormAmount} from "../__amount/PaymentFormAmount";
import {PaymentFormCheckbox} from "../__checkbox/PaymentFormCheckbox";
import {PaymentFormComment} from "../__comment/PaymentFormComment";
import {PaymentFormDate} from "../__date/PaymentFormDate";
import {PaymentFormListItem} from "../__list-item/PaymentFormListItem";
import {PaymentFormSelectCategory} from "../__select-category/PaymentFormSelectCategory";
import {PaymentFormSubmit} from "../__submit/PaymentFormSubmit";

import "./PaymentFormList.css";

export class PaymentFormList extends Component {

    render() {
        return (
            <ul className={"payment-form__list"}>
                <PaymentFormListItem itemContent={<PaymentFormSelectCategory/>}/>
                <PaymentFormListItem itemContent={<PaymentFormDate/>}/>
                <PaymentFormListItem itemContent={<PaymentFormAmount/>}/>
                <PaymentFormListItem itemContent={<PaymentFormCheckbox/>}/>
                <PaymentFormListItem itemContent={<PaymentFormComment/>}/>
                <PaymentFormListItem itemContent={<PaymentFormSubmit/>}/>
            </ul>
        );
    }

}