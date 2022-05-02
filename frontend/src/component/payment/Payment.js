import {Component} from "react";

import "./Payment.css";

export class Payment extends Component {

    render() {
        return (
            <div className={"payment-container"}>
                <form action="/some-link-here" className="payment-form">
                    <ul className={"payment-form__list"}>
                        <li className="payment-form__item">
                            <input className="payment-form__comment" name={"comment"} type="text"
                                   placeholder={"Комментарий"}/>
                        </li>
                        <li className="payment-form__item">
                            <select className="payment-form__select-category" name={"category"} id="form-select">
                                <option value="" className="payment-form__select-option" selected disabled>Выбрать
                                    категорию
                                </option>
                                <option value="1" className="payment-form__select-option">Расходы</option>
                                <option value="2" className="payment-form__select-option">Новая категория</option>
                            </select>
                        </li>
                        <li className="payment-form__item">
                            <input className="payment-form__date" name={"date"} type="date"/>
                        </li>
                        <li className="payment-form__item">
                            <input className="payment-form__amount" name={"amount"} type="number" step={"0.01"}/>
                        </li>
                        <li className="payment-form__item">
                            <fieldset className={"payment-form__fieldset"}>
                                <input className="payment-form__sign" value="-" name={"sign"} type="radio" id={"minus"}
                                       defaultChecked/>
                                <label className="payment-form__label" htmlFor={"minus"}>-</label>
                                <input className="payment-form__sign" value="+" name={"sign"} type="radio" id={"plus"}/>
                                <label className="payment-form__label" htmlFor={"plus"}>+</label>
                            </fieldset>
                        </li>
                        <li className="payment-form__item">
                            <button className="payment-form__submit" type={"button"}>Создать</button>
                        </li>
                    </ul>
                </form>
                <div className="payment-content">
                    Here is the payment content
                </div>
            </div>
        );
    }

}