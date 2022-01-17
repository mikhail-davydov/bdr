import React from "react";

class PayContent extends React.Component {

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
                <button className="button" type="button" onClick={this.handleClick.bind(this, "Нажал")}>
                    Нажми
                </button>
            </form>
        );
    }

}

export default PayContent;