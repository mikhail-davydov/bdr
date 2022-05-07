import {Component} from "react";
import {PaymentFormSelectOption} from "../__select-option/PaymentFormSelectOption";

import "./PaymentFormSelectCategory.css";

export class PaymentFormSelectCategory extends Component {

    constructor(props) {
        super(props);
        this.handleChange = this.handleChange.bind(this);
        this.state = {
            defaultCategoryOptionValue: -1,
            categories: []
        }
    }

    render() {
        let categories = this.state.categories.map(category =>
            <PaymentFormSelectOption
                key={category.id}
                selectOptionId={category.id}
                selectOptionText={category.name}
                selectOptionDisabled={false}
            />
        );

        return (
            <select className="payment-form__select-category"
                    value={this.state.defaultCategoryOptionValue}
                    onChange={this.handleChange} name={"category"}>
                <PaymentFormSelectOption
                    key="-1"
                    selectOptionId="-1"
                    selectOptionText="Выбрать Категорию"
                    selectOptionDisabled={true}
                />
                {categories}
            </select>
        );
    }

    handleChange(event) {
        this.setState({
            defaultCategoryOptionValue: event.target.defaultCategoryOptionValue
        });
    }

    componentDidMount() {
        // todo: fetch categories list from db
        this.setState({
            categories: [
                {id: 1, name: "Расходы"},
                {id: 2, name: "Новая (очень длинная) категория"}
            ]
        })
    }



}