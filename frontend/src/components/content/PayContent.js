import React from "react";
import Button from "../button/Button";

class PayContent extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            buttonClass: "button",
            clickMe: "Нажми меня",
            clicked: "Нажал"
        }
    }

    handleClick(content) {
        this.props.handleButtonClick(content);
    }

    render() {
        return (
            <form className="pay-form">
                <label>
                    Name:
                    <input type="text" name="name"/>
                </label>
                <Button buttonClass={this.state.buttonClass}
                        handleClick={this.handleClick.bind(this, this.state.clicked)}
                        buttonValue={this.state.clickMe}
                />
            </form>
        );
    }

}

export default PayContent;